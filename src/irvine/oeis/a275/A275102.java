package irvine.oeis.a275;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: -(685800000*x^7-675420000*x^6+136905500*x^5-8043550*x^4+17550*x^3+9249*x^2-194*x+1)/((x-1)*(30*x-1)*(5*x-1)*(60*x-1)*(10*x-1)*(120*x-1)*(20*x-1))
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A275102 Number of set partitions of [5*n] such that within each block the numbers of elements from all residue classes modulo n are equal for n&gt;0, a(0)=1.
 * @author Georg Fischer
 */
public class A275102 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A275102() {
    super(0, "[1,-194,9249,17550,-8043550,136905500,-675420000,685800000]", "[1,-246,20545,-751800,12911500,-100380000,304200000,-216000000]");
  }
}
