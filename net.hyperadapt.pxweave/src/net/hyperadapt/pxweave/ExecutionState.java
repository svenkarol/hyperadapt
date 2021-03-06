package net.hyperadapt.pxweave;

import java.util.List;

import net.hyperadapt.pxweave.aspects.IProgrammaticJoinpoint;
import net.hyperadapt.pxweave.context.IWeavingContext;
import net.hyperadapt.pxweave.interpreter.IInterpreterArgument;

/**
 * Default execution state implementation.
 * 
 * @author skarol
 * 
 */
public class ExecutionState implements IExecutionState {
	
	private IProgrammaticJoinpoint jp = null;
	private IWeavingContext context = null;
	private List<IInterpreterArgument> data = null;
	
	public ExecutionState(IProgrammaticJoinpoint jp,IWeavingContext context,List<IInterpreterArgument> data){
		this.jp = jp;
		this.context = context;
		this.data = data;
	}
 
	@Override
	public IWeavingContext getContextModel() {
		return context;
	}

	@Override
	public IProgrammaticJoinpoint getCurrentJoinpoint() {
		return jp;
	}

	@Override
	public List<IInterpreterArgument> getData() {
		return data;
	}
	
}
