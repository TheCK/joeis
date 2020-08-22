package irvine.oeis.a177;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: log(1+x)*sinh(x)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A177699 E.g.f.: log(1+x)*sinh(x).
 * @author Georg Fischer
 */
public class A177699 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A177699() {
    super(0, "[[0],[4],[16],[-3,-32,-8],[-238,-184,-32],[-465,2,158,48,4],[2420,3184,1380,248,16],[12000,10490,3383,478,25],[17640,12768,3438,408,18],[8400,5330,1255,130,5]]", "[0,0,2,-3,12,-40,190,-1071,7224,-56232]", 8);
    setGfType(1);
  }
}
