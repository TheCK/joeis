package irvine.oeis.a109;
// Generated by gen_seq4.pl latriang at 2020-07-28 21:29

import irvine.math.z.Z;
import irvine.oeis.LatticeCoordinationSequence;


/**
 * A109001 Triangle, read by rows, where g.f. of row n equals the product of (1-x)^n and the g.f. of the coordination sequence for root lattice B_n, for n &gt;= 0.
 * @author Georg Fischer
 */
public class A109001 extends LatticeCoordinationSequence {

  /** Construct the sequence. */
  public A109001() {
    super("B", 0);
  }

  @Override
  public Z next() {
    return nextTriangleElement("B", 0); 
  } 
}
