package irvine.oeis.a194;
// Generated by gen_seq4.pl dex CR.valueOf(1151).log().divide(CR.valueOf(95).log()) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A194362 The decimal expansion of log(1151) / log(95).
 * @author Georg Fischer
 */
public class A194362 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A194362() {
    super(CR.valueOf(1151).log().divide(CR.valueOf(95).log()));
  }
}
