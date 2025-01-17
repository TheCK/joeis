package irvine.oeis.a161;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A161039 Number of partitions of n into odd numbers where every part appears at least 3 times.
 * This version directly implements the formula <code>product(1+x^(3*(2*j-1))/(1-x^(2*j-1)), j > 0)</code>.
 * It becomes slow for n &gt; 32.
 * @author Georg Fischer
 */
public class A161039 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  protected int mN; // current index
  protected int mOccur; // number of occurrences of the parts

  /**
   * Empty constructor
   */
  public A161039() {
    this(1, 3);
  }
  
  /**
   * Constructor with number of occurrences,
   * used by A161040-A161050 generated with partcapp.
   * @param offset index of the first term of the sequence
   * @param occur minimal number of occurrences of the parts
   */
  public A161039(final int offset, final int occur) {
    mOccur = occur;
    mN = offset - 1;
  }
  
  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> prod = RING.one();
    for (int k = 1; k <= mN; ++k) {
      final int expon = 2 * k - 1; // odd numbers
      prod = RING.multiply(prod, RING.add(RING.one(),
         RING.series(RING.monomial(Z.ONE, mOccur * expon), RING.oneMinusXToTheN(expon), mN)), mN);
    }
    return prod.coeff(mN);
  }

}
