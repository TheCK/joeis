package irvine.oeis.a277;
// Generated by gen_seq4.pl holos at 2021-06-07 19:33
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A277222 Number of permutations of length n that avoid 4123, 1324, and 31524.
 * radtorec(1/2*(3-22*x+54*x^2-54*x^3+25*x^4-4*x^5-(5*x^4-16*x^3+14*x^2-6*x+1)*(1-4*x)^(1/2))/(1-4*x)^(1/2)/(x^2-3*x+1)^2)
 * @author Georg Fischer
 */
public class A277222 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A277222() {
    super(0, "[[0],[16240,-2280, 80],[-151006, 22094,-808],[478208,-71549, 2661],[-228894, 14626, 488],[-2390870, 524274,-28348],[7205838,-1632388, 92122],[-10125310, 2506734,-154724],[8348572,-2313314, 159658],[-4317324, 1367762,-107702],[1427022,-530358, 48816],[-297534, 134460,-14958],[37158,-21588, 3054],[-2458, 2028,-398],[62,-92, 30],[0, 1,-1]]", "1, 1, 2, 6, 22, 86, 343, 1374, 5497, 21926, 87176, 345612, 1366960, 5396604, 21275618, 83793268, 329791425, 1297428774, 5103039279, 20069815052", 0);
  }
}
