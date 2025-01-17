package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051116 Number of monotone Boolean functions of n variables with 8 mincuts.
 * @author Sean A. Irvine
 */
public class A051116 implements Sequence {

  private static final int[][] C = {
    {1, 256},
    {-56, 192},
    {336, 160},
    {280, 144},
    {560, 136},
    {-336, 132},
    {112, 130},
    {-16, 129},
    {-1652, 128},
    {-6720, 120},
    {7140, 112},
    {3360, 108},
    {-3360, 102},
    {13440, 100},
    {672, 99},
    {-672, 98},
    {7224, 96},
    {-20160, 92},
    {6720, 90},
    {-2240, 88},
    {13440, 86},
    {3360, 85},
    {-63840, 84},
    {-3360, 83},
    {11760, 82},
    {-2800, 81},
    {-1960, 80},
    {-47040, 78},
    {-6720, 77},
    {61320, 76},
    {-13440, 75},
    {44800, 74},
    {5040, 73},
    {77840, 72},
    {-6720, 71},
    {52416, 70},
    {28560, 69},
    {-51912, 68},
    {56, 67},
    {-99792, 66},
    {30632, 65},
    {-38318, 64},
    {21840, 63},
    {-80640, 62},
    {6720, 61},
    {-128240, 60},
    {-40320, 59},
    {57120, 58},
    {-55440, 57},
    {190680, 56},
    {30240, 55},
    {105840, 54},
    {-6720, 53},
    {50400, 52},
    {-42000, 51},
    {21840, 50},
    {44940, 49},
    {-38220, 48},
    {-28560, 47},
    {-194320, 46},
    {4480, 45},
    {15120, 44},
    {151200, 43},
    {-283920, 42},
    {52080, 41},
    {46200, 40},
    {-285712, 39},
    {299320, 38},
    {220080, 37},
    {252840, 36},
    {65016, 35},
    {-195720, 34},
    {-234024, 33},
    {-185640, 32},
    {-235130, 31},
    {-47600, 30},
    {388080, 29},
    {190260, 28},
    {-173040, 27},
    {166320, 26},
    {186480, 25},
    {-120680, 24},
    {-229880, 23},
    {-77280, 22},
    {-173880, 21},
    {272160, 20},
    {241500, 19},
    {-38080, 18},
    {-96320, 17},
    {-170471, 16},
    {-241640, 15},
    {294000, 14},
    {235200, 13},
    {-316428, 12},
    {39200, 11},
    {162456, 10},
    {27076, 9},
    {-149324, 8},
    {40614, 7},
    {-78792, 6},
    {78792, 5},
    {13068, 4},
    {-26136, 3},
    {5040, 2},
  };

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final int[] c : C) {
      sum = sum.add(Z.valueOf(c[1]).pow(mN).multiply(c[0]));
    }
    return sum.divide(40320);
  }
}
