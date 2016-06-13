package interfaces.filters;

public class LowPass extends Filter
{
	double cutoff;
	public void HighPass(double cutoff) { this.cutoff = cutoff; }
	public Waveform process(Waveform input) { return input; }
}
