package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216175 Number of all polyhedra (tetrahedra of <code>any</code> orientation and octahedra) of <code>any</code> size, formed when intersecting a regular tetrahedron by planes parallel to its sides and dividing its edges into n equal parts.
 * @author Sean A. Irvine
 */
public class A216175 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216175() {
    super(new long[] {1, -3, 2, 1, 0, -1, -2, 3}, new long[] {1, 6, 20, 50, 104, 193, 329, 526});
  }
}
