package irvine.oeis.a001;

import irvine.math.lattice.BccLattice;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001666 Number of <code>n-step self-avoiding</code> walks on b.c.c. lattice.
 * @author Sean A. Irvine
 */
public class A001666 implements Sequence {

  private final BccLattice mLattice = new BccLattice();
  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new SelfAvoidingWalker(mLattice));
  private final long mC = mLattice.neighbour(mLattice.origin(), 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 8, 7, mLattice.origin(), mC));
  }
}
