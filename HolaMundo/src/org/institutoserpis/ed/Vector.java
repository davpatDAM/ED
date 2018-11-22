package org.institutoserpis.ed;

public class Vector {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int[] v = new int[] {16, 12, 15, 14, 17};

	//	int index = indexOf(v, 12);
	//	Sistem.out.println("index="+index);
	//}
	//	
	
		/*for (int index = O; index < v.length; index++)
		if (v[index] ==x)
		return index;
		return -1;
		
}

	public static int min(int[] v) {
		return -33; //TODO implemetar
	
}
	public static void main(String[] args) {
	int[] array1 =new int [] {14,18,19,10,12};
	System.out.println(menor(array1));	
	}

	public static int menor(int [] num){
        int iMenor = 0;
        for(int i=1;i<num.length;i++){
            if(num[i]<num[iMenor])
                iMenor = i;
        }
        return num[iMenor];
    }
	

		public static int index0fMin(int[] v){
			int x = menor(v);
			for(int i=0;i < v.length;i++){
				if(v[i] == x)
					return i;
				
    }
			return -1;
			
}
		
			public static int selection(int[] v, int n)
			{
				int min;
				for (int i=0; i < v.length; ++i)
				{
					min = i;
					for (int j = i + 1; j < v.length; j++)
				
				if (v[j] < v[min])
					min = j; 
					
					int aux = v[min];
					v[min]=v[i];
					v[i]= aux;
				}
				
				return v[n-1];
	
			}
	
}*/
	public static int indexOMin(int[] v, int initialIndex) {
		int indexOfMin = initialIndex;
		for (int index = initialIndex + 1; index < v.length; index++)
			if(v[index] < v[indexOfMin])
				indexOfMin = index;
		return indexOfMin;
	}
	public static int swap(int[] v, int indexOne,int indexTwo) {
		int indexOfMin = initialIndex;
		for (int index = initialIndex + 1; index < v.length; index++)
			if(v[index] < v[indexOfMin])
				indexOfMin = index;
		return indexOfMin;
	}
	
	public static void sort (int[] v) {
		//indexOfSelected - index del elemento seleccionado (0, 1, 2...n-2)
		//index0fMin [indexOfSlected n-1]
		//index[indexOfSelected +1, n-1] auxiliar para obtener indexOfMin
		int n = v. length;
		for (int indexOfSelected = 0; indexOfSelected < n -1; indexOdSelected++)
			int indexOfMin = indexOfSelected;
			for (int index = indexOfSelected + 1; index < n; index++)
				if (v[index] < v[indexOfMin])
					indexOfMin = index;
			int aux = v[indexOfSelected];
			v[indexOfSelected] = v[indexOfMin];
			v[index=fMin] = aux;
	}
	
	for (int index = 0; index < v.length - 1: index++)
		swap(v, index, indexOfMin, index));
}
					
	}