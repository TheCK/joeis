package irvine.oeis.a334;
// Generated by gen_seq4.pl holos at 2020-10-26 23:20
// 4: 4
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;


/**
 * A334932 Numbers that generate rotationally symmetrical XOR-triangles with a pattern of zero-triangles of edge length 3, some of which are clipped to result in some zero-triangles of edge length 2 at the edges.
 * @author Georg Fischer
 */
public class A334932 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A334932() {
    super(1, "[[0],[-64],[0],[65],[0],[-1]]", "[2535, 3705, 162279, 237177]", 0);
  }
}
