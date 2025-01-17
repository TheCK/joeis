package irvine.oeis.a048;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a038.A038024;

/**
 * A048799 Decimal expansion of Sum_{n &gt;= 2} 1/S(n)!, where S(n) is the Kempner number A002034(n).
 * @author Sean A. Irvine
 */
public class A048799 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A048799() {
    super(new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        if (precision < 0) {
          final Sequence kempner = new SkipSequence(new A038024(), 1);
          int k = 1;
          Z f = Z.ONE;
          Z u;
          do {
            f = f.multiply(++k);
            u = kempner.next().shiftLeft(-precision).divide(f);
            sum = sum.add(u);
          } while (!u.isZero());
        }
        return sum;
      }
    });
  }
}
