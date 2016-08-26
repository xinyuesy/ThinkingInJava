package interfaces.interfaceprocessor;

import interfaces.filters.BandPass;
import interfaces.filters.Filter;
import interfaces.filters.HighPass;
import interfaces.filters.LowPass;
import interfaces.filters.Waveform;

//适配器设计模式
class FilterAdapter implements Processor
{
	Filter filter;

	public FilterAdapter(Filter filter)
	{
		this.filter = filter;
	}

	public String name()
	{
		return filter.name();
	}

	public Object process(Object input)
	{
		return filter.process((Waveform) input);
	}
}

public class FilterProcessor
{
	public static void main(String[] args)
	{
		Waveform w = new Waveform();
		Apply.process(new FilterAdapter(new LowPass(1.0)), w);
		Apply.process(new FilterAdapter(new HighPass(2.0)), w);
		Apply.process(new FilterAdapter(new BandPass(3.0, 5.0)), w);
	}

}
