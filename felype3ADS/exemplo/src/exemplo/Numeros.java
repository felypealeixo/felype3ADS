package exemplo;


public class Numeros{
	public int numero_inicial;
	public int numero_final;
	public int soma = 0;
	
	public int soma (int n1, int n2)
	{
		this.numero_inicial = n1;
		this.numero_final = n2;
				
		for(int i = this.numero_inicial; i <= this.numero_final; i++)
		{
			this.soma += i;
		}
		return this.soma;
	}
}