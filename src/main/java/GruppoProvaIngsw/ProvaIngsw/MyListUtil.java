package GruppoProvaIngsw.ProvaIngsw;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class MyListUtil 
{
    
	public ArrayList<Integer> ordinaNumeri(ArrayList<Integer> lista, boolean crescente)
	{
		if (crescente==true)
		{
			lista.sort(null);
		}
		
		else
		{
			lista.sort(null);
			ArrayList<Integer> listareverse = new ArrayList<Integer>();
			
			for(int i=lista.size()-1; i>0; i--)
			{
				listareverse.add(lista.get(1));
			}
			
			for(int i=0; i< listareverse.size(); i++)
			{
				lista.set(i, listareverse.get(i));
			}
		}
		
		return lista;
	}
	
}
