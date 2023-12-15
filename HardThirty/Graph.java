package HardThirty;

import java.util.*;

public class Graph {

    static class edge {
        private int source;
        private int destination;
        private int weight;

        edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    public static void bfsSearch(int v, boolean visited[], ArrayList<edge> graph[]) {
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                bfs(graph, v, visited, i);
            }
        }
    }

    public static void bfs(ArrayList<edge> graph[], int v, boolean visited[], int start) {
        Queue<Integer> neighbours = new LinkedList<>();
        neighbours.add(start);
        while (!neighbours.isEmpty()) {
            int curr = neighbours.remove();
            if (!visited[curr]) {
                System.out.print(curr + ", ");
                visited[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    neighbours.add(graph[curr].get(i).destination);
                }
            }
        }
    }

    public static void createGraph(ArrayList<edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<edge>();
        }

        graph[0].add(new edge(0, 2, 2));

        graph[1].add(new edge(1, 2, 10));
        graph[1].add(new edge(1, 3, 0));

        graph[2].add(new edge(2, 0, 2));
        graph[2].add(new edge(2, 1, 10));
        graph[2].add(new edge(2, 3, -1));

        graph[3].add(new edge(3, 1, 0));
        graph[3].add(new edge(3, 2, -1));
        graph[3].add(new edge(3, 4, 5));

        graph[4].add(new edge(4, 3, 2));
    }

    public static void dfs(ArrayList<edge> graph[], int curr, boolean visited[]) {
        visited[curr] = true;
        System.out.println(curr);
        for (int i = 0; i < graph[curr].size(); i++) {
            if (!visited[graph[curr].get(i).destination]) {

                dfs(graph, graph[curr].get(i).destination, visited);
            }
        }
    }

    public static void allpossiblepath(ArrayList<edge> graph[],boolean visited[],int curr,int target,String path)
    {
        if(curr == target)
        {
            System.out.println(path );
            return;
        }
        for (int i = 0; i < graph[curr].size(); i++) {
            if(!visited[curr])
            {
                visited[curr] = true;
                allpossiblepath(graph, visited, graph[curr].get(i).destination, target, path+graph[curr].get(i).destination);
                visited[curr]= false;
            }
        }
    }

    public static void main(String[] args) {
        int v = 5;

        ArrayList<edge> graph[] = new ArrayList[v];
        createGraph(graph);
        boolean visited[] = new boolean[v];
        // bfsSearch(v, visited, graph);
        // System.out.println();



        allpossiblepath(graph,new boolean[v],0,3,"0");

        dfs(graph, 0, visited);
    }
}
