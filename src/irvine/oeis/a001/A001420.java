package irvine.oeis.a001;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import jmason.poly.Polyiamond;
import jmason.poly.PolyiamondCounter;

/**
 * A001420 Number of fixed <code>2-dimensional triangular-celled</code> animals with n cells <code>(n-iamonds</code>, polyiamonds) in the 2-dimensional hexagonal lattice.
 * @author Sean A. Irvine
 */
public class A001420 implements Sequence {

  private int mN = 0;
  private ArrayList<Polyiamond> mPrevList = null;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.TWO;
    }
    final PolyiamondCounter pc = new PolyiamondCounter(mN);
    pc.run(true, true, false, mPrevList, false);
    mPrevList = pc.getList();
    return Z.valueOf(pc.getCu().getCounter(mN));
  }
}