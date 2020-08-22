package irvine.oeis.a324;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: (1-3*x+x^2)^3*(1+3*x+x^2)^3*(1-x^2)^10/((1-4*x-x^2)*(1-x-x^2)^6*(1+x-x^2)^9)
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A324486 G.f. = (1-3*x+x^2)^3*(1+3*x+x^2)^3*(1-x^2)^10/((1-4*x-x^2)*(1-x-x^2)^6*(1+x-x^2)^9).
 * @author Georg Fischer
 */
public class A324486 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A324486() {
    super(0, "[1,0,-31,0,405,0,-2950,0,13480,0,-41508,0,90163,0,-142135,0,165150,0,-142135,0,90163,0,-41508,0,13480,0,-2950,0,405,0,-31,0,1]", "[1,-1,-31,10,395,11,-2836,-641,13015,4380,-40719,-15801,90074,35605,-143915,-52948,168028,52948,-143915,-35605,90074,15801,-40719,-4380,13015,641,-2836,-11,395,-10,-31,1,1]");
  }
}
