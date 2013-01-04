import java.util.ArrayList;


public class TestDecTree {

	public static void main(String[] args)
	{
		
	}
	

}
class DecisionNode
{
	ArrayList<DecisionBranch> links = new ArrayList<DecisionBranch>();
}

class Branch
{
	int linksToNode; 
	
	Branch(int id)
	{
		this.linksToNode = id;
	}
}

//These are 'choices', things that the person chooses to do
class ProbBranch extends Branch
{
	double probability; 
	
	ProbBranch(int id, double probability) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	
}

//These are things the person already does
//We can either have 'exact' attributes where x = 2 or we can have ranges.
//Attribute Decisions should really have both unless its descrete
class AttrBranch extends Branch
{
	
}