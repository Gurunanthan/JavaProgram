package SortingAlgorithms;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {
                218, 786, 409, 950, 60, 339, 41, 77, 744, 705, 341, 5, 205, 162, 630, 144, 962, 692, 527, 685, 431, 666,
                951, 189, 998, 242, 727, 674, 631, 275, 316, 315, 530, 19, 337, 421, 53, 886, 100, 628, 866, 140, 859,
                823, 811, 41, 19, 681, 29, 960, 557, 531, 598, 257, 477, 182, 749, 967, 897, 183, 85, 679, 658, 564,
                629, 90, 250, 315, 831, 163, 378, 961, 635, 372, 334, 423, 231, 283, 800, 441, 213, 762, 846, 129, 17,
                964, 953, 880, 693, 883, 251, 556, 803, 175, 236, 389, 255, 17, 696, 874, 703, 477, 720, 665, 359, 830,
                860, 491, 101, 691, 338, 381, 134, 599, 326, 867, 451, 271, 367, 503, 20, 716, 105, 375, 423, 64, 947,
                941, 580, 669, 743, 192, 360, 577, 714, 623, 68, 454, 984, 694, 642, 126, 669, 361, 876, 339, 10, 861,
                312, 788, 770, 446, 436, 980, 767, 379, 458, 189, 238, 774, 616, 394, 556, 151, 247, 330, 203, 472, 893,
                239, 942, 931, 705, 830, 589, 624, 723, 890, 52, 227, 53, 809, 646, 386, 818, 704, 722, 707, 610, 994,
                983, 68, 151, 75, 282, 413, 791, 844, 384, 639, 614, 423, 298, 488, 911, 81, 733, 854, 870, 671, 858,
                993, 942, 153, 257, 598, 170, 940, 244, 181, 546, 444, 507, 444, 980, 422, 468, 484, 172, 91, 325, 329,
                18, 72, 816, 80, 63, 834, 289, 449, 107, 544, 807, 83, 381, 729, 725, 118, 888, 892, 867, 164, 103, 574,
                566, 33, 909, 101, 680, 890, 955, 379, 661, 498, 295, 727, 36, 342, 61, 230, 463, 66, 877, 887, 23, 421,
                320, 259, 622, 344, 928, 763, 162, 596, 612, 628, 107, 432, 268, 109, 882, 610, 479, 865, 997, 181, 775,
                336, 139, 976, 686, 632, 641, 808, 423, 896, 246, 627, 259, 909, 57, 837, 390, 110, 205, 833, 645, 50,
                463, 797, 391, 562, 300, 135, 189, 320, 257, 942, 415, 54, 920, 921, 469, 156, 947, 964, 94, 625, 561,
                778, 641, 370, 330, 580, 302, 209, 641, 542, 591, 709, 205, 355, 360, 87, 483, 39, 536, 293, 684, 842,
                387, 471, 295, 541, 14, 214, 35, 933, 135, 644, 466, 940, 734, 775, 909, 54, 115, 40, 16, 705, 293, 752,
                378, 286, 308, 457, 540, 453, 469, 410, 963, 173, 592, 509, 916, 248, 238, 491, 795, 572, 804, 695, 919,
                702, 823, 791, 973, 202, 459, 822, 904, 485, 524, 679, 266, 851, 288, 172, 330, 117, 495, 541, 690, 954,
                687, 517, 723, 262, 705, 45, 887, 208, 114, 660, 955, 605, 311, 302, 631, 450, 432, 688, 164, 38, 815,
                470, 665, 998, 910, 876, 433, 338, 570, 337, 740, 661, 751, 402, 144, 739, 529, 499, 76, 243, 5, 583,
                634, 619, 490, 272, 351, 2, 496, 978, 824, 304, 179, 98, 802, 106, 579, 781, 125, 170, 27, 747, 102,
                252, 691, 178, 992, 627, 957, 46, 382, 953, 321, 958, 272, 997, 445, 954, 896, 111, 269, 896, 160, 327,
                186, 926, 761, 564, 362, 570, 314, 496, 621, 446, 715, 176, 47, 199, 765, 18, 166, 92, 929, 599, 154,
                995, 881, 536, 691, 815, 167, 180, 276, 734, 208, 319, 235, 607, 92, 999, 513, 609, 61, 336, 212, 942,
                961, 695, 142, 462, 133, 804, 626, 472, 480, 472, 467, 283, 474, 838, 361, 811, 559, 502, 473, 695, 844,
                196, 167, 623, 789, 768, 699, 91, 888, 414, 733, 655, 210, 125, 974, 835, 875, 773, 325, 998, 616, 41,
                978, 426, 942, 885, 938, 842, 990, 361, 904, 401, 521, 394, 141, 700, 1, 154, 755, 631, 329, 590, 859,
                614, 970, 30, 561, 161, 3, 249, 785, 131, 133, 310, 705, 308, 320, 247, 667, 89, 253, 936, 789, 229,
                274, 142, 382, 842, 459, 290, 855, 248, 723, 852, 843, 886, 206, 460, 813, 542, 514, 284, 77, 841, 546,
                106, 686, 636, 278, 906, 919, 939, 419, 815, 92, 162, 106, 730, 64, 67, 280, 323, 673, 201, 786, 988,
                104, 107, 546, 30, 20, 484, 738, 42, 898, 679, 764, 882, 931, 983, 579, 472, 994, 741, 834, 660, 632,
                291, 631, 355, 902, 77, 196, 658, 494, 359, 898, 946, 407, 561, 202, 734, 219, 288, 681, 272, 254, 894,
                918, 905, 549, 345, 532, 663, 361, 497, 463, 416, 511, 531, 917, 549, 925, 779, 858, 498, 499, 574, 639,
                282, 611, 413, 297, 72, 70, 893, 882, 488, 965, 68, 310, 555, 297, 974, 651, 121, 143, 797, 205, 505,
                539, 767, 294, 940, 616, 337, 167, 408, 690, 834, 918, 465, 64, 914, 852, 937, 897, 73, 280, 191, 762,
                684, 861, 310, 753, 122, 718, 844, 753, 924, 642, 35, 578, 491, 671, 661, 228, 268, 319, 232, 176, 830,
                585, 337, 755, 340, 62, 76, 176, 622, 130, 626, 169, 314, 986, 643, 930, 480, 400, 363, 546, 147, 183,
                153, 526, 411, 157, 506, 932, 575, 637, 917, 457, 951, 238, 551, 567, 496, 996, 678, 959, 953, 201, 203,
                967, 107, 15, 809, 95, 477, 100, 418, 494, 412, 243, 616, 36, 722, 355, 968, 564, 582, 718, 163, 641,
                281, 320, 511, 185, 537, 698, 251, 985, 38, 634, 247, 495, 121, 393, 825, 30, 789, 952, 740, 882, 701,
                88, 251, 304, 645, 637, 260, 673, 101, 766, 975, 259, 376, 651, 341, 564, 419, 131, 198, 68, 105, 842,
                403, 541, 322, 27, 570, 610, 652, 864, 791, 849, 434, 787, 47, 158, 272, 607, 616, 566, 537, 832, 869,
                253, 512, 556, 254, 588, 426, 348, 691, 530, 277, 51, 881, 606, 122, 754, 558, 359, 333, 710, 86, 424,
                997, 599, 207, 114, 919, 61, 130, 256, 493, 193, 856, 73, 300, 933, 588, 54, 99, 553, 72, 385, 671, 907,
                207, 973, 987, 666, 825, 792, 701, 752, 997, 106, 276, 161, 464, 968, 958, 396, 916, 994, 557, 501, 269,
                141, 609, 356, 364, 781, 113, 518, 62, 267, 491, 893, 95, 583, 731, 903, 616, 858, 64, 968, 920, 123,
                242, 765, 486, 876, 40, 198, 628, 760, 238, 959, 767, 123, 131, 868, 155, 350, 856, 766, 347, 885, 765,
                277, 407, 935, 326, 548, 758, 98, 106, 732, 83, 408, 660, 670, 300, 858, 858, 473, 20, 807, 187, 756,
                243, 864, 438, 272, 411, 188, 493, 349, 75, 211, 600, 992, 953, 626, 806, 46, 144, 26, 983, 751, 481,
                428, 36, 977, 518, 789, 944, 288, 146, 634, 56, 855, 684, 305, 629, 606, 410, 651, 891, 41, 777, 369,
                322, 160, 139, 970, 537, 424, 658, 999, 274, 997, 120, 500, 856, 530, 705, 227, 894, 631, 24, 726, 865,
                582, 215, 880, 285, 562, 114, 216, 926, 876, 290, 451, 69, 267, 679, 966, 378, 927, 207, 949, 40, 907,
                11, 307, 948, 564, 177, 958, 911, 170, 404, 830, 483, 43, 279, 210, 898, 574, 601, 182, 58, 354, 73,
                309, 37, 788, 411, 983, 45, 975, 739, 248, 437, 507, 366, 29, 778, 204, 777, 739, 144, 630, 113, 534,
                969, 274, 297, 435, 16, 144, 641, 914, 228, 937, 715, 107, 832, 591, 458, 100, 191, 659, 123, 204, 141,
                875, 606, 71, 352, 942, 621, 223, 509, 957, 514, 499, 903, 408, 280, 374, 107, 650, 664, 647, 23, 771,
                76, 145, 104, 912, 487, 158, 27, 328, 67, 813, 219, 869, 797, 60, 569, 373, 99, 788, 250, 981, 189, 464,
                650, 673, 49, 801, 894, 994, 112, 2, 871, 140, 487, 610, 899, 803, 216, 875, 501, 466, 142, 422, 220,
                847, 616, 393, 594, 270, 780, 903, 987, 689, 901, 194, 717, 657, 631, 15, 358, 547, 887, 837, 153, 554,
                424, 140, 155, 100, 1000, 918, 130, 732, 849, 21, 60, 300, 147, 849, 221, 389, 606, 163, 907, 349, 198,
                620, 756, 347, 743, 347, 207, 225, 480, 575, 392, 959, 348, 953, 396, 160, 491, 788, 140, 635, 543, 364,
                775, 65, 738, 249, 536, 837, 77, 862, 983, 717, 244, 34, 547, 308, 269, 619, 125, 225, 839, 913, 200,
                79, 902, 910, 284, 522, 861, 616, 697, 139, 293, 913, 313, 32, 865, 347, 990, 419, 196, 699, 443, 861,
                226, 185, 495, 407, 4, 705, 268, 357, 95, 553, 821, 864, 748, 735, 405, 286, 497, 711, 253, 199, 950,
                254, 709, 503, 181, 294, 364, 891, 904, 966, 507, 298, 870, 196, 179, 201, 808, 690, 55, 683, 150, 483,
                76, 716, 991, 808, 524, 120, 85, 780, 738, 756, 615, 208, 840, 448, 384, 43, 485, 784, 357, 522, 490,
                630, 355, 80, 883, 54, 838, 850, 563, 574, 823, 802, 328, 655, 197, 885, 181, 980, 468, 251, 70, 598,
                499, 435, 150, 585, 279, 505, 901, 199, 949, 429, 766, 799, 581, 144, 644, 970, 498, 629, 284, 666, 974,
                114, 893, 614, 922, 922, 932, 110, 642, 865, 788, 512, 831, 947, 179, 77, 247, 937, 312, 924, 415, 761,
                681, 592, 176, 993, 289, 624, 511, 855, 525, 411, 783, 216, 599, 13, 193, 939, 404, 755, 195, 361, 825,
                183, 327, 124, 307, 864, 546, 673, 827, 706, 605, 395, 263, 709, 512, 941, 630, 476, 82, 244, 604, 813,
                293, 591, 731, 416, 575, 932, 587, 93, 99, 88, 704, 671, 238, 522, 129, 735, 501, 260, 993, 854, 291,
                383, 550, 498, 929, 507, 887, 12, 750, 792, 267, 652, 878, 611, 532, 354, 47, 880, 635, 762, 542, 873,
                109, 875, 968, 592, 218, 444, 405, 463, 638, 803, 470, 409, 568, 428, 727, 716, 449, 354, 872, 102, 599,
                949, 853, 489, 799, 864, 598, 341, 560, 669, 944, 296, 644, 584, 970, 140, 626, 397, 652, 629, 22, 310,
                866, 77, 651, 341, 494, 255, 143, 195, 387, 660, 116, 27, 478, 637, 382, 909, 335, 597, 736, 506, 110,
                226, 553, 673, 560, 449, 493, 781, 656, 787, 982, 35, 290, 927, 881, 451, 723, 149, 917, 618, 788, 980,
                157, 57, 997, 369, 615, 335, 423, 102, 37, 670, 762, 570, 745, 76, 365, 90, 510, 632, 931, 588, 17, 734,
                962, 99, 38, 113, 296, 628, 495, 772, 798, 468, 175, 742, 414, 484, 517, 999, 961, 250, 100, 3, 33, 533,
                367, 546, 877, 996, 10, 394, 259, 388, 444, 434, 927, 853, 568, 931, 378, 703, 794, 141, 662, 982, 319,
                43, 717, 119, 461, 36, 674, 22, 161, 63, 615, 734, 928, 314, 749, 28, 981, 183, 427, 528, 953, 996, 485,
                848, 505, 701, 117, 107, 905, 16, 607, 927, 798, 949, 431, 680, 266, 752, 317, 198, 656, 557, 768, 481,
                838, 766, 305, 988, 763, 491, 102, 339, 294, 287, 367, 634, 966, 387, 45, 939, 192, 626, 750, 755, 611,
                585, 318, 323, 272, 248, 599, 326, 924, 600, 865, 371, 39, 427, 572, 9, 783, 875, 122, 817, 134, 984,
                930, 133, 243, 882, 295, 388, 12, 943, 119, 118, 505, 401, 63, 626, 323, 735, 876, 842, 859, 799, 252,
                575, 399, 917, 291, 455, 919, 450, 17, 855, 918, 819, 385, 215, 684, 445, 677, 329, 840, 666, 453, 900,
                779, 667, 750, 835, 375, 402, 655, 422, 247, 195, 374, 810, 840, 551, 257, 306, 189, 484, 257, 897, 256,
                28, 401, 570, 604, 335, 652, 590, 968, 832, 84, 305, 390, 850, 671, 154, 833, 557, 580, 133, 877, 993,
                732, 103, 952, 869, 11, 637, 430, 557, 429, 562, 386, 78, 557, 363, 688, 718, 329, 40, 17, 893, 409, 9,
                589, 18, 639, 274, 156, 204, 112, 989, 688, 150, 40, 75, 26, 269, 380, 726, 5, 57, 489, 526, 496, 302,
                890, 374, 532, 814, 54, 562, 365, 828, 904, 424, 518, 767, 624, 295, 29, 82, 207, 480, 814, 196, 640,
                424, 763, 153, 129, 696, 88, 836, 785, 481, 244, 975, 811, 151, 324, 673, 521, 225, 642, 858, 100, 433,
                387, 54, 143, 710, 263, 772, 524, 628, 593, 9, 934, 285, 629, 782, 237, 734, 89, 315, 72, 1000, 508,
                670, 469, 178, 556, 36, 684, 208, 540, 227, 386, 778, 450, 385, 25, 722, 22, 741, 340, 195, 958, 736,
                895, 539, 958, 751, 397, 518, 549, 152, 436, 479, 371, 519, 372, 642, 575, 388, 269, 923, 333, 602, 653,
                317, 76, 846, 920, 392, 206, 402, 394, 826, 792, 909, 600, 433, 273, 521, 493, 650, 176, 145, 256, 985,
                286, 269, 451, 813, 986, 628, 718, 375, 379, 956, 362, 647, 568, 72, 961, 875, 675, 279, 442, 165, 885,
                253, 716, 312, 595, 112, 944, 87, 509, 505, 192, 130, 591, 973, 262, 366, 369, 592, 213, 935, 721, 117,
                324, 836, 257, 947, 345, 264, 930, 775, 226, 320, 167, 602, 782, 366, 103, 552, 330, 113, 218, 420, 288,
                903, 332, 227, 698, 840, 848, 188, 724, 952, 804, 744, 624, 512, 970, 659, 58, 633, 926, 647, 67, 423,
                235, 298, 36, 622, 577, 308, 936, 580, 665, 127, 76, 931, 657, 506, 243, 768, 498, 196, 121, 605, 278,
                442, 833, 943, 568, 477, 706, 805, 348, 539, 372, 590, 525, 744, 840, 277, 101, 656, 870, 236, 335, 132,
                576, 538, 344, 127, 260, 155, 140, 460, 567, 578, 693, 366, 660, 485, 431, 643, 307, 381, 423, 462, 807,
                161, 641, 200, 792, 598, 360, 978, 103, 261, 656, 137, 352, 993, 31, 582, 193, 811, 562, 209, 953, 52,
                869, 193, 20, 894, 354, 771, 603, 431, 83, 749, 144, 803, 634, 630, 599, 974, 901, 508, 144, 299, 383,
                273, 872, 603, 209, 386, 615, 453, 944, 821, 221, 270, 488, 287, 822, 358, 415, 576, 685, 335, 372, 836,
                268, 250, 621, 838, 873, 352, 640, 906, 220, 345, 497, 520, 108, 189, 459, 488, 354, 5, 10, 502, 190,
                837, 396, 300, 301, 520, 296, 350, 668, 216, 718, 926, 950, 728, 278, 660, 345, 192, 333, 986, 95, 133,
                138, 498, 313, 218, 919, 412, 429, 903, 971, 975, 560, 12, 460, 139, 886, 858, 106, 961, 214, 598, 62,
                248, 499, 547, 745, 37, 517, 683, 177, 494, 807, 721, 166, 251, 161, 558, 107, 849, 349, 423, 904, 380,
                958, 71, 421, 185, 501, 118, 432, 981, 382, 350, 183, 670, 823, 909, 226, 308, 800, 876, 951, 170, 325,
                235, 169, 535, 129, 950, 690, 44, 213, 488, 325, 322, 46, 443, 673, 889, 45, 578, 56, 951, 759, 851,
                478, 611, 549, 587, 644, 869, 854, 751, 715, 212, 440, 397, 334, 507, 53, 686, 369, 569, 954, 320, 790,
                635, 891, 907, 446, 792, 834, 656, 380, 586, 967, 689, 821, 836, 433, 641, 644, 756, 939, 833, 514, 190,
                266, 28, 10, 618, 106, 768, 643, 539, 663, 858, 342, 69, 289, 332, 727, 682, 641, 701, 689, 177, 209,
                637, 642, 964, 712, 363, 646, 109, 475, 438, 279, 844, 623, 636, 593, 911, 898, 930, 940, 983, 185, 969,
                987, 699, 892, 121, 361, 651, 862, 485, 475, 122, 145, 858, 432, 681, 446, 437, 246, 636, 490, 489, 686,
                628, 100, 153, 511, 120, 466, 312, 560, 240, 204, 490, 119, 184, 560, 495, 7, 350, 580, 108, 718, 568,
                739, 637, 116, 309, 806, 139, 23, 422, 628, 950, 268, 824, 220, 583, 16, 217, 791, 277, 924, 220, 299,
                698, 927, 355, 649, 776, 733, 552, 704, 374, 461, 208, 795, 505, 745, 620, 653, 121, 342, 437, 581, 305,
                883, 956, 60, 498, 127, 116, 915, 965, 635, 981, 386, 667, 582, 629, 227, 979, 191, 260, 701, 574, 877,
                708, 285, 667, 515, 235, 406, 754, 151, 343, 489, 63, 577, 237, 560, 630, 441, 486, 828, 93, 201, 231,
                646, 602, 978, 123, 634, 985, 242, 607, 760, 690, 626, 642, 476, 934, 166, 86, 910, 60, 350, 287, 412,
                364, 906, 711, 283, 718, 146, 244, 588, 600, 754, 391, 314, 515, 845, 130, 802, 921, 273, 765, 604, 701,
                464, 532, 574, 774, 479, 177, 240, 377, 175, 993, 474, 795, 168, 454, 337, 808, 677, 137, 456, 210, 355,
                977, 611, 818, 308, 501, 495, 340, 800, 49, 158, 962, 443, 88, 679, 888, 377, 463, 745, 847, 373, 18,
                727, 720, 721, 805, 519, 446, 752, 33, 677, 880, 775, 609, 517, 858, 338, 295, 438, 144, 60, 576, 849,
                343, 598, 105, 17, 471, 16, 565, 196, 816, 341, 476, 279, 871, 120, 193, 841, 686, 149, 56, 854, 694,
                867, 874, 587, 945, 773, 870, 473, 960, 399, 758, 946, 886, 990, 835, 217, 303, 424, 822, 62, 353, 587,
                829, 607, 749, 50, 230, 170, 226, 889, 242, 150, 183, 225, 873, 898, 682, 103, 454, 205, 953, 903, 870,
                365, 12, 935, 139, 19, 61, 646, 607, 243, 502, 843, 416, 73, 878, 265, 271, 495, 879, 32, 468, 859, 207,
                215, 617, 677, 256, 365, 809, 374, 398, 112, 589, 252, 61, 772, 355, 491, 973, 269, 388, 630, 235, 648,
                880, 874, 629, 731, 81, 171, 305, 981, 768, 903, 962, 512, 463, 193, 801, 99, 108, 769, 796, 676, 7,
                358, 429, 699, 353, 701, 234, 569, 217, 667, 36, 31, 644, 358, 902, 67, 663, 738, 180, 782, 172, 120,
                253, 545, 399, 257, 591, 573, 228, 408, 46, 761, 23, 229, 880, 614, 424, 821, 120, 519, 393, 311, 405,
                844, 725, 306, 614, 894, 550, 554, 692, 85, 163, 657, 612, 748, 309, 226, 263, 614, 140, 784, 936, 786,
                106, 661, 154, 34, 468, 280, 563, 690, 369, 117, 881, 83, 152, 992, 152, 543, 314, 156, 245, 575, 585,
                262, 17, 240, 148, 503, 333, 356, 912, 94, 327, 804, 780, 219, 271, 595, 265, 936, 832, 150, 364, 379,
                526, 384, 482, 214, 936, 442, 423, 455, 122, 79, 954, 930, 651, 430, 800, 653, 437, 697, 732, 804, 646,
                922, 536, 59, 610, 44, 331, 66, 395, 903, 799, 610, 142, 334, 253, 278, 835, 147, 376, 589, 841, 123,
                858, 555, 187, 171, 383, 71, 947, 977, 668, 808, 42, 768, 179, 768, 281, 179, 143, 314, 223, 250, 862,
                216, 551, 426, 743, 533, 612, 287, 889, 554, 348, 293, 342, 820, 295, 492, 339, 98, 235, 554, 861, 444,
                942, 242, 369, 863, 190, 378, 551, 917, 112, 298, 540, 857, 491, 768, 763, 400, 600, 337, 896, 619, 305,
                698, 745, 801, 155, 452, 929, 505, 609, 806, 153, 926, 806, 661, 581, 243, 887, 678, 89, 613, 34, 83,
                478, 752, 39, 436, 869, 881, 866, 125, 463, 555, 170, 870, 751, 982, 641, 760, 212, 961, 784, 642, 694,
                520, 767, 891, 340, 417, 806, 794, 928, 464, 434, 970, 848, 690, 303, 233, 986, 694, 127, 872, 771, 327,
                780, 12, 132, 935, 480, 395, 481, 390, 382, 322, 847, 600, 388, 883, 330, 740, 344, 740, 560, 184, 220,
                306, 917, 154, 575, 797, 68, 466, 762, 844, 783, 747, 899, 922, 996, 752, 705, 880, 668, 435, 69, 946,
                848, 984, 442, 126, 482, 793, 873, 222, 77, 91, 979, 639, 450, 269, 819, 106, 665, 960, 207, 552, 720,
                194, 91, 658, 843, 381, 506, 494, 312, 580, 323, 797, 293, 910, 324, 514, 721, 643, 45, 805, 340, 267,
                779, 445, 115, 622, 911, 989, 924, 966, 747, 13, 298, 416, 976, 721, 661, 602, 671, 950, 618, 782, 130,
                57, 963, 589, 374, 946, 962, 767, 632, 853, 335, 230, 729, 49, 707, 330, 863, 329, 553, 207, 513, 753,
                416, 619, 750, 330, 295, 427, 3, 622, 254, 941, 71, 424, 12, 632, 373, 402, 955, 464, 118, 362, 780, 38,
                104, 646, 327, 556, 206, 676, 300, 974, 461, 574, 783, 884, 201, 971, 740, 324, 162, 161, 887, 940, 230,
                54, 838, 645, 980, 46, 781, 747, 602, 911, 150, 273, 308, 112, 443, 809, 362, 848, 129, 137, 36, 523,
                523, 169, 821, 38, 472, 217, 9, 76, 226, 936, 243, 113, 564, 103, 664, 571, 391, 651, 922, 873, 769,
                682, 402, 676, 594, 341, 997, 2, 636, 51, 513, 105, 71, 334, 525, 936, 239, 70, 371, 769, 795, 860, 826,
                523, 834, 866, 332, 980, 899, 629, 840, 444, 569, 636, 333, 21, 817, 83, 597, 878, 402, 16, 793, 110,
                56, 518, 583, 445, 405, 544, 188, 646, 453, 653, 439, 209, 524, 921, 564, 782, 678, 533, 882, 212, 202,
                205, 866, 199, 652, 575, 260, 967, 974, 931, 407, 389, 578, 78, 165, 777, 942, 65, 97, 510, 117, 286,
                318, 663, 182, 706, 141, 932, 699, 734, 810, 508, 345, 496, 620, 326, 982, 950, 655, 867, 100, 90, 88,
                826, 952, 457, 36, 959, 327, 606, 261, 494, 407, 164, 162, 113, 781, 232, 114, 521, 424, 132, 933, 466,
                776, 40, 159, 551, 108, 332, 258, 140, 296, 520, 143, 90, 615, 916, 160, 852, 843, 707, 701, 633, 606,
                738, 785, 19, 859, 511, 232, 348, 590, 597, 816, 672, 765, 731, 896, 877, 890, 108, 97, 478, 886, 873,
                392, 344, 843, 714, 685, 196, 326, 445, 940, 99, 255, 725, 5, 464, 742, 603, 666, 686, 260, 938, 701,
                194, 283, 36, 875, 836, 587, 618, 432, 855, 858, 513, 320, 264, 335, 872, 959, 939, 780, 814, 23, 304,
                477, 592, 916, 525, 665, 848, 165, 893, 700, 81, 105, 190, 118, 543, 242, 960, 716, 308, 235, 842, 193,
                388, 378, 198, 504, 202, 458, 300, 969, 411, 961, 901, 278, 16, 392, 238, 48, 890, 140, 100, 227, 358,
                767, 358, 522, 824, 140, 638, 841, 755, 14, 514, 61, 214, 563, 151, 274, 27, 914, 709, 345, 9, 862, 709,
                995, 297, 622, 302, 87, 477, 715, 608, 244, 348, 421, 336, 700, 107, 978, 233, 197, 949, 28, 708, 204,
                683, 382, 446, 808, 599, 835, 880, 489, 186, 363, 428, 139, 110, 234, 163, 603, 885, 247, 315, 124, 848,
                918, 398, 534, 452, 546, 534, 549, 366, 851, 492, 713, 743, 855, 159, 175, 723, 688, 418, 347, 972, 259,
                630, 784, 387, 384, 991, 446, 750, 379, 683, 103, 733, 877, 636, 214, 367, 927, 575, 172, 473, 429, 765,
                160, 550, 907, 399, 347, 371, 127, 502, 877, 721, 402, 112, 183, 237, 556, 639, 166, 300, 459, 955, 312,
                248, 640, 744, 631, 112, 934, 274, 15, 987, 735, 725, 966, 973, 381, 889, 895, 42, 818, 210, 890, 63,
                965, 133, 404, 120, 154, 959, 582, 164, 84, 800, 716, 892, 441, 436, 141, 683, 778, 546, 450, 368, 862,
                974, 221, 806, 858, 809, 208, 988, 79, 752, 950, 376, 136, 946, 826, 935, 974, 570, 914, 1000, 113, 805,
                295, 382, 245, 373, 44, 652, 904, 236, 497, 714, 164, 37, 107, 558, 389, 883, 161, 70, 352, 925, 365,
                98, 197, 505, 22, 607, 411, 109, 230, 933, 111, 318, 428, 562, 985, 15, 721, 631, 875, 475, 231, 440,
                94, 813, 946, 297, 978, 724, 15, 68, 490, 901, 860, 800, 266, 120, 27, 635, 439, 221, 94, 807, 905, 511,
                936, 331, 439, 734, 246, 184, 663, 315, 369, 100, 488, 548, 672, 996, 502, 831, 302, 497, 289, 691, 5,
                93, 763, 226, 814, 679, 244, 379, 127, 19, 332, 253, 207, 877, 836, 861, 201, 827, 49, 976, 738, 354,
                782, 388, 576, 305, 852, 496, 698, 362, 825, 901, 94, 775, 315, 156, 507, 281, 655, 518, 820, 803, 171,
                906, 276, 389, 316, 233, 68, 12, 12, 14, 927, 679, 91, 290, 415, 941, 169, 548, 830, 466, 638, 853, 994,
                569, 918, 32, 277, 202, 45, 608, 616, 524, 658, 237, 220, 550, 707, 22, 533, 960, 293, 274, 468, 671,
                221, 146, 95, 613, 520, 518, 887, 422, 364, 416, 461, 686, 881, 717, 97, 505, 832, 679, 249, 827, 854,
                183, 627, 926, 812, 936, 496, 473, 887, 407, 436, 933, 479, 975, 534, 387, 94, 946, 640, 697, 30, 977,
                603, 468, 207, 708, 635, 56, 597, 565, 930, 546, 754, 206, 380, 126, 773, 315, 855, 140, 766, 898, 52,
                965, 772, 863, 334, 252, 6, 52, 270, 176, 690, 694, 153, 542, 229, 210, 431, 659, 88, 446, 856, 79, 907,
                741, 692, 868, 472, 282, 607, 686, 943, 694, 400, 693, 218, 844, 877, 693, 804, 841, 125, 407, 659, 425,
                129, 880, 678, 972, 32, 327, 652, 288, 917, 100, 660, 112, 687, 572, 779, 978, 357, 649, 533, 119, 628,
                286, 27, 187, 806, 936, 405, 740, 817, 656, 612, 887, 369, 854, 190, 893, 58, 167, 975, 837, 375, 207,
                489, 188, 64, 625, 424, 551, 196, 866, 685, 801, 83, 574, 204, 904, 997, 107, 316, 857, 197, 306, 418,
                364, 444, 892, 770, 154, 171, 416, 252, 346, 441, 498, 327, 916, 300, 712, 532, 173, 240, 870, 154, 825,
                225, 801, 465, 150, 743, 680, 589, 68, 837, 751, 937, 523, 798, 894, 925, 830, 429, 438, 302, 851, 6,
                435, 545, 12, 407, 156, 620, 111, 645, 255, 984, 953, 420, 618, 134, 954, 118, 917, 821, 242, 927, 699,
                910, 626, 867, 488, 4, 548, 981, 108, 363, 4, 101, 692, 772, 176, 172, 106, 594, 107, 815, 859, 596,
                487, 614, 782, 799, 776, 696, 765, 119, 534, 613, 515, 755, 819, 471, 750, 834, 875, 422, 982, 349, 744,
                839, 123, 475, 109, 72, 13, 691, 411, 258, 604, 921, 911, 491, 784, 240, 116, 368, 683, 880, 709, 692,
                11, 460, 251, 839, 468, 580, 268, 21, 793, 82, 245, 345, 883, 26, 574, 70, 138, 299, 355, 171, 104, 652,
                508, 513, 725, 341, 530, 50, 829, 123, 697, 111, 342, 87, 677, 661, 54, 956, 461, 206, 265, 700, 565,
                816, 15, 830, 927, 868, 644, 13, 289, 669, 281, 832, 954, 426, 881, 289, 101, 34, 382, 637, 776, 987,
                649, 655, 351, 615, 224, 241, 73, 28, 425, 152, 468, 662, 685, 226, 621, 499, 480, 103, 223, 859, 269,
                265, 413, 666, 863, 338, 747, 852, 9, 737, 629, 436, 95, 704, 419, 616, 158, 356, 109, 892, 886, 634,
                600, 97, 680, 923, 819, 794, 498, 684, 963, 747, 287, 620, 889, 991, 475, 442, 86, 860, 700, 131, 381,
                805, 709, 829, 590, 412, 836, 515, 395, 850, 859, 934, 691, 332, 564, 740, 117, 955, 357, 655, 478, 89,
                74, 237, 915, 827, 50, 111, 850, 799, 506, 752, 219, 835, 214, 596, 252, 335, 798, 994, 441, 217, 253,
                192, 795, 91, 988, 289, 7, 635, 909, 462, 695, 727, 716, 390, 734, 618, 295, 131, 157, 424, 415, 339,
                691, 514, 423, 127, 281, 390, 432, 700, 50, 110, 687, 451, 122, 979, 470, 615, 574, 206, 831, 851, 241,
                178, 328, 965, 695, 650, 863, 859, 17, 243, 895, 936, 313, 213, 267, 963, 232, 19, 743, 285, 355, 484,
                54, 37, 260, 750, 565, 769, 877, 927, 383, 867, 663, 343, 770, 526, 728, 285, 78, 739, 251, 12, 806,
                660, 946, 817, 279, 765, 222, 508, 293, 106, 383, 673, 53, 832, 479, 202, 509, 348, 848, 426, 600, 82,
                838, 577, 165, 388, 983, 911, 903, 327, 863, 999, 576, 507, 848, 722, 526, 463, 967, 484, 871, 150, 618,
                607, 697, 50, 869, 666, 258, 907, 652, 965, 190, 60, 858, 780, 687, 851, 543, 893, 439, 955, 889, 176,
                209, 840, 154, 403, 941, 318, 383, 335, 90, 389, 448, 482, 309, 533, 339, 9, 48, 451, 499, 10, 694, 525,
                334, 548, 611, 192, 765, 227, 825, 435, 932, 180, 909, 623, 649, 337, 103, 773, 937, 673, 56, 748, 326,
                575, 198, 254, 109, 598, 3, 743, 859, 654, 644, 1, 368, 341, 173, 886, 532, 93, 138, 627, 469, 85, 664,
                924, 643, 431, 657, 162, 563, 894, 574, 975, 743, 146, 8, 714, 742, 866, 503, 339, 544, 580, 507, 452,
                746, 11, 753, 817, 240, 686, 413, 470, 264, 473, 374, 332, 603, 331, 999, 320, 727, 603, 769, 296, 511,
                87, 206, 699, 924, 98, 416, 444, 596, 41, 112, 801, 105, 163, 563, 718, 997, 131, 831, 994, 593, 843,
                475, 11, 637, 415, 244, 531, 546, 779, 587, 38, 507, 305, 436, 766, 657, 411, 330, 837, 877, 865, 670,
                454, 449, 1000, 15, 721, 200, 855, 379, 489, 4, 263, 51, 244, 230, 783, 708, 958, 575, 401, 82, 442,
                421, 373, 119, 854, 562, 103, 945, 626, 463, 879, 114, 877, 965, 766, 425, 308, 28, 736, 918, 312, 236,
                130, 202, 675, 337, 768, 668, 831, 292, 227, 568, 274, 571, 742, 27, 329, 707, 516, 634, 128, 20, 536,
                551, 820, 627, 729, 213, 381, 613, 127, 427, 92, 790, 622, 548, 52, 922, 358, 96, 928, 139, 20, 803, 89,
                769, 818, 827, 266, 887, 141, 583, 754, 594, 856, 218, 661, 437, 293, 847, 720, 887, 963, 7, 967, 486,
                641, 989, 597, 965, 221, 619, 822, 265, 177, 446, 356, 953, 170, 771, 349, 868, 943, 685, 493, 956, 371,
                607, 45, 336, 822, 59, 744, 583, 606, 765, 294, 896, 253, 250, 871, 151, 104, 938, 13, 402, 564, 948,
                358, 777, 853, 705, 829, 348, 396, 488, 340, 126, 164, 553, 928, 823, 129, 917, 545, 728, 901, 994, 917,
                895, 792, 973, 168, 379, 892, 448, 521, 449, 755, 915, 708, 60, 981, 510, 743, 20, 273, 653, 732, 701,
                855, 812, 626, 648, 320, 577, 104, 998, 739, 698, 720, 793, 125, 771, 43, 421, 108, 154, 670, 19, 712,
                350, 233, 199, 47, 529, 968, 871, 91, 174, 464, 108, 554, 637, 391, 29, 425, 484, 128, 102, 878, 1000,
                930, 392, 801, 249, 533, 234, 173, 379, 144, 93, 393, 560, 361, 573, 390, 707, 810, 763, 229, 296, 724,
                671, 823, 728, 691, 131, 319, 544, 726, 723, 159, 312, 761, 464, 70, 441, 705, 116, 363, 584, 363, 112,
                577, 415, 345, 890, 639, 243, 386, 898, 731, 360, 557, 786, 546, 16, 554, 366, 134, 458, 701, 201, 397,
                975

        };

        SelectionSort sSort = new SelectionSort();
        BubbleSort bSort = new BubbleSort();
        InsertionSort iSort = new InsertionSort();
        MergeSort mSort = new MergeSort();
        QuickSort qSort = new QuickSort();

        // sSort.SelectionSortingFunction(arr);
        // bSort.BubbleSortingFunction(arr);
        // iSort.InsertionSortFunction(arr);
        // mSort.mergeSortFunction(arr);
        // qSort.QuickSortingFunction(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
