package irvine.oeis.a342;
// Generated by gen_seq4.pl holos at 2021-06-02 19:27
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A342328 Number of sets in the geometry determined by the Hausdorff metric at each location between two sets defined by a complete bipartite graph K(6,n) (with n at least 4) missing three edges, where all three removed edges are incident to different vertices in the 6-point set but exactly two removed edges are incident to the same vertex in the other set.
 * Lin.rec. signature: (120,-4593, 69688,-428787, 978768,-615195)
 * @author Georg Fischer
 */
public class A342328 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A342328() {
    super(4, "[0,-615195, 978768,-428787, 69688,-4593, 120,-1]", "1068475, 89633839, 6458329435, 433976684431, 28211055010555, 1804746233554159, 114556965257054875, 7243790885015626831, 457188176014823960635, 28828588756092946562479, 1816999192589895468925915, 114495695622871975031439631", 0);
  }
}
