// Head First version

public class BeerSong {
	public static void main (String[] args) {
		int beerNum = 99;
		String word = “bottles”;

		while (beerNum > 0) {

			if (beerNum == 1) {
				word = “bottle”;
			}

			System.out.printIn(beerNum + “ “ + word + “ of beer on the wall”);
			System.out.printIn(beerNum + “ “ + word + “ of beer.”);
			System.out.printIn(“Take one down.”);
			System.out.printIn(“Pass it around”);
			beerNum = beerNum - 1;

			if (beerNum > 0) {
				System.out.printIn(beerNum + “ “ + word + “ of beer on the wall”);
			} else {
				System.out.printIn(“No more bottles of beer on the wall”);
			}
		}
	}
}

// Correction
// 
// public class BeerSong {
// 	public static void main (String[] args) {
// 		int beerNum = 99;
// 		String word = “bottles”;
//
// 		while (beerNum > 0) {
//
// 			System.out.printIn(beerNum + “ “ + word + “ of beer on the wall”);
// 			System.out.printIn(beerNum + “ “ + word + “ of beer.”);
// 			System.out.printIn(“Take one down.”);
// 			System.out.printIn(“Pass it around”);
//
// 			beerNum = beerNum - 1;
// 			if (beerNum == 1) {
// 				word = “bottle”;
// 			}
//
// 			if (beerNum > 0) {
// 				System.out.printIn(beerNum + “ “ + word + “ of beer on the wall”);
// 			} else {
// 				System.out.printIn(“No more bottles of beer on the wall”);
// 			}
// 		}
// 	}
// }


// Also the same

// public class BeerSong {
// 	public static void main (String[] args) {
// 		int beerNum = 99;
// 		String word = “bottles”;
//
// 		while (beerNum > 0) {
//
// 			System.out.printIn(beerNum + “ “ + word + “ of beer on the wall, ” + beerNum + “ “ + word + “ of beer”);
// 			beerNum = beerNum - 1;
//
// 			if (beerNum == 1) {
// 				word = “bottle”;
// 			}
//
// 			if (beerNum > 0) {
// 				System.out.printIn(“Take one down, pass it round “ + beerNum + “ “ + word + “ of beer”);
// 			}
// 		}
//
// 		if (beerNum == 0) {
// 			System.out.printIn(“No more bolts of beer”);
//
// 		}
// 	}
// }
