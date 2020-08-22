package irvine.oeis.a189;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: -(x^30+x^29-154*x^28+6777*x^26-1440*x^25-123961*x^24+26752*x^23+1132714*x^22-185889*x^21-5684515*x^20+574750*x^19+16401668*x^18-708928*x^17-27757938*x^16+27757938*x^14+708928*x^13-16401668*x^12-574750*x^11+5684515*x^10+185889*x^9-1132714*x^8-26752*x^7+123961*x^6+1440*x^5-6777*x^4+154*x^2-x-1)/(x^32-209*x^30+11936*x^28-274208*x^26+3112032*x^24-19456019*x^22+70651107*x^20-152325888*x^18+196664896*x^16-152325888*x^14+70651107*x^12-19456019*x^10+3112032*x^8-274208*x^6+11936*x^4-209*x^2+1)
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A189005 Number of domino tilings of the 9 X n grid with upper left corner removed iff n is odd.
 * @author Georg Fischer
 */
public class A189005 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A189005() {
    super(0, "[1,1,-154,0,6777,-1440,-123961,26752,1132714,-185889,-5684515,574750,16401668,-708928,-27757938,0,27757938,708928,-16401668,-574750,5684515,185889,-1132714,-26752,123961,1440,-6777,0,154,-1,-1]", "[1,0,-209,0,11936,0,-274208,0,3112032,0,-19456019,0,70651107,0,-152325888,0,196664896,0,-152325888,0,70651107,0,-19456019,0,3112032,0,-274208,0,11936,0,-209,0,1]");
  }
}
