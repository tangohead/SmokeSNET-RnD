
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import repast.simphony.context.Context;
import repast.simphony.engine.schedule.ScheduledMethod;
import repast.simphony.space.graph.Network;
import repast.simphony.space.graph.RepastEdge;

import graphtools.generators.*;

public class BaseHuman{
	String id;
	private Context<?> context;
	private Network<BaseHuman> network;
	
	public BaseHuman(String id, Context<?> context, Network<BaseHuman> network)
	{
		this.id = id;
		this.context = context;
		this.network = network;
		//Insert code for adding to network
		ScaleFree.addToRSF(this, context, network, false);
	}
	
	@ScheduledMethod(start = 1, interval = 100)
	public void step() {
		//insert decisions, etc
		//decide actions
		//reconfigure networks
		
	}

	public String getID() {
		return id;
	}

	
}
