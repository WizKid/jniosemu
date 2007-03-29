package jniosemu.instruction.emulator;

import jniosemu.emulator.Emulator;
import jniosemu.emulator.EmulatorException;

public class MulxsuInstruction extends RTypeInstruction
{
	public MulxsuInstruction(int opCode) {
		super(opCode);
	}

	public void run(Emulator em) throws EmulatorException {
                long vA = (long)em.readRegister(rA);
                long vB = signedToUnsigned(em.readRegister(rB));
                long vC = vA*vB;
                vC = vC >>> 32;
                em.writeRegister(rC, (int)vC);
	}
}
