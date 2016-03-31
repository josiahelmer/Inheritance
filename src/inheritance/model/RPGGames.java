package inheritance.model;

import java.util.ArrayList;

public class RPGGames extends Videogames
{
	public RPGGames()
	{
		this.setcontrols(controls());
		this.setgraphics("poor");
		this.goodquality("true");
	}
	


	private void setgraphics(String string)
	{

		
	}

	public ArrayList<String> controls()
	{
		ArrayList<String> controls = new ArrayList<String>();
		controls.add("Jump");
		controls.add("Move");
		controls.add("Attack");
		controls.add("Talk");
		controls.add("Trade");
		return controls;
	}

	@Override
	public boolean isFun()
	{


		return false;
	}

	@Override
	public boolean isSeries()
	{


		return false;
	}

	@Override
	public boolean isMulitplayer()
	{


		return false;
	}

	@Override
	public void gameRate(int rating)
	{


		
	}

	@Override
	public void gameCatagory(String catagory)
	{


		
	}
	
	


}
