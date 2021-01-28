public class Labyrinthe{

	//ATTENTION À LIRE SVP!
	//Je tien à m'excuser de la longueur du programme que vous allez évaluez-çi dessous,
	//L'affichage de la sortie fonctionne en autant qu'il y en ai une. Je me suis basé sur le
	//principle qu'on puisse être capable de trouver la sortie pour n'importe quel labyrinthe du même format
	
	//Merci de votre temps, 
	//Patrick Fortier :)

    //affiche le labyrinthe sur 20 lignes et 40 colonnes
    public static void afficher(int[][] grid){
    	
        for (int i=0;i<grid.length;i++){
        	for (int j=0;j<grid.length;j++) {
        		
        	
			if (grid[i][j] ==0) {
				System.out.print("..");
			} else if(grid[i][j]==1){
				System.out.print("\u2588\u2588");
			} else if (grid[i][j]==-1) {
				System.out.print("  ");
			} 
		} System.out.println();
        }
        System.out.println();
        System.out.println("Cette methode doit afficher le labyrinthe");
        for (int i=0;i<10;i++){
            System.out.print("\u2588\u2588");
			System.out.print("  ");
		}
        System.out.println();
    
}

    
    //resout le labyrinthe
    public static boolean resoudre(int[][] grille){
       boolean sortie = true;
      	for(int i=1;i<grille.length-1;i++) {
    		for(int j=1; j <grille.length-1;j++) {
    		
    			 if(grille[i][j]==0) { 
    				if(grille[i+1][j]==0 || grille[i][j+1]==0 || grille[i][j-1]==0 || grille[i-1][j]==0) {
    			
    				sortie = true;
    			} else {
    				sortie = false;
    			}
    		}
    	 }
   	  } if (sortie == false) {
      		return sortie;
      } else {
    	
      	
    	for(int i=1;i<grille.length-1;i++) {
    		for(int j=1; j <grille.length-1;j++) {
    			
    			//Trouver les culs-de-sacs
    			if(grille[i][j]==0&&    grille[i+1][j]==1 && grille[i][j+1]==1 && grille[i-1][j]==1||  			
    			   grille[i][j]==0&&    grille[i+1][j]==1 && grille[i][j+1]==1 && grille[i][j-1]==1||	  
    			   grille[i][j]==0&&    grille[i-1][j]==1 && grille[i][j-1]==1 && grille[i][j+1]==1||  		
    		       grille[i][j]==0&&    grille[i+1][j]==1 && grille[i][j-1]==1 && grille[i-1][j]==1) {
    			
    				  grille[i][j] = -1;
    			   
    			}
    		}
    	}
    			
    			boolean arretePas=true;
    	
    	    	for(int i=1;i<grille.length-1;i++) {
    	    		for(int j=1; j <grille.length-1;j++) {
    				
    					// TEST
    				 if(grille[i][j]==0&&   (grille[i+1][j]==-1 && grille[i][j+1]==1 && grille[i-1][j]==1) ||
                    	grille[i][j]==0&&	(grille[i+1][j]==1 && grille[i][j+1]==-1 && grille[i-1][j]==1) ||
    					grille[i][j]==0&& 	(grille[i+1][j]==1 && grille[i][j+1]==1 && grille[i-1][j]==-1) ||
    			        grille[i][j]==0&&   (grille[i+1][j]==1 && grille[i][j+1]==-1 && grille[i-1][j]==-1) ||
    			        grille[i][j]==0&&   (grille[i+1][j]==-1 && grille[i][j+1]==-1 && grille[i-1][j]==1) ||
    			        grille[i][j]==0&&   (grille[i+1][j]==-1 && grille[i][j+1]==1 && grille[i-1][j]==-1) ||
    			        grille[i][j]==0&&   (grille[i+1][j]==-1 && grille[i][j+1]==-1 && grille[i-1][j]==-1) ||
    	    			   
    			        grille[i][j]==0&&   (grille[i+1][j]==-1 && grille[i][j+1]==1 && grille[i-1][j]==1)||
    			        grille[i][j]==0&&   (grille[i+1][j]==-1 && grille[i][j+1]==-1 && grille[i-1][j]==1)||
    			       	grille[i][j]==0&&   (grille[i+1][j]==-1 && grille[i][j+1]==-1 && grille[i-1][j]==-1)||
    			   		grille[i][j]==0&&   (grille[i+1][j]==-1 && grille[i][j+1]==-1 && grille[i-1][j]==-1)||
    			   		grille[i][j]==0&&   (grille[i+1][j]==-1 && grille[i][j+1]==1 && grille[i-1][j]==-1)||
    			   		grille[i][j]==0&&  	(grille[i+1][j]==-1 && grille[i][j+1]==1 && grille[i-1][j]==-1)||
    			   		grille[i][j]==0&& 	(grille[i+1][j]==-1 && grille[i][j+1]==-1 && grille[i-1][j]==1)||
    	    	    	   
    			   		grille[i][j]==0&&   (grille[i+1][j]==1 && grille[i][j+1]==1 && grille[i-1][j]==1)||
    			   		grille[i][j]==0&&   (grille[i+1][j]==1 && grille[i][j+1]==-1 && grille[i-1][j]==1)||
    			  		grille[i][j]==0&&   (grille[i+1][j]==1 && grille[i][j+1]==1 && grille[i-1][j]==-1)||
    			  		grille[i][j]==0&&   (grille[i+1][j]==1 && grille[i][j+1]==1 && grille[i-1][j]==1)||
    			  		grille[i][j]==0&&   (grille[i+1][j]==1 && grille[i][j+1]==1 && grille[i-1][j]==-1)||
    			  		grille[i][j]==0&&   (grille[i+1][j]==1 && grille[i][j+1]==-1 && grille[i-1][j]==1)||
    			  		grille[i][j]==0&&   (grille[i+1][j]==1 && grille[i][j+1]==-1 && grille[i-1][j]==-1)||
    					//TEST
    			  		
    			  		//TEST2
    			  		grille[i][j]==0&&   (grille[i][j+1]==1 && grille[i-1][j]==1 && grille[i][j-1]==1)||
    	               	grille[i][j]==0&&	(grille[i][j+1]==-1 && grille[i-1][j]==1 && grille[i][j-1]==-1)||
    	    			grille[i][j]==0&& 	(grille[i][j+1]==1 && grille[i-1][j]==-1 && grille[i][j-1]==1)||
    	    	        grille[i][j]==0&&   (grille[i][j+1]==-1 && grille[i-1][j]==-1 && grille[i][j-1]==-1)||
    	    	        grille[i][j]==0&&   (grille[i][j+1]==-1 && grille[i-1][j]==1 && grille[i][j-1]==1)||
    	    	        grille[i][j]==0&&   (grille[i][j+1]==1 && grille[i-1][j]==-1 && grille[i][j-1]==-1)||
    	    	        grille[i][j]==0&&   (grille[i][j+1]==-1 && grille[i-1][j]==-1 && grille[i][j-1]==-1)||
    	    	    			   
    	    	        grille[i][j]==0&&   (grille[i][j+1]==1 && grille[i-1][j]==1 && grille[i][j-1]==1)||
    	    	        grille[i][j]==0&&   (grille[i][j+1]==-1 && grille[i-1][j]==1 && grille[i][j-1]==1)||
    	    	       	grille[i][j]==0&&   (grille[i][j+1]==-1 && grille[i-1][j]==-1 && grille[i][j-1]==1)||
    	    	   		grille[i][j]==0&&   (grille[i][j+1]==-1 && grille[i-1][j]==-1 && grille[i][j-1]==-1)||
    	    	   		grille[i][j]==0&&   (grille[i][j+1]==1 && grille[i-1][j]==-1 && grille[i][j-1]==1)||
    	    	   		grille[i][j]==0&&  	(grille[i][j+1]==1 && grille[i-1][j]==-1 && grille[i][j-1]==-1)||
    	    	   		grille[i][j]==0&& 	(grille[i][j+1]==-1 && grille[i-1][j]==1 && grille[i][j-1]==-1)||
    	    	    	    	   
    	    	   		grille[i][j]==0&&   (grille[i][j+1]==1 && grille[i-1][j]==1 && grille[i][j-1]==1)||
    	    	   		grille[i][j]==0&&   (grille[i][j+1]==-1 && grille[i-1][j]==1 && grille[i][j-1]==1)||
    	    	  		grille[i][j]==0&&   (grille[i][j+1]==1 && grille[i-1][j]==-1 && grille[i][j-1]==1)||
    	    	  		grille[i][j]==0&&   (grille[i][j+1]==1 && grille[i-1][j]==1 && grille[i][j-1]==-1)||
    	    	  		grille[i][j]==0&&   (grille[i][j+1]==1 && grille[i-1][j]==-1 && grille[i][j-1]==-1)||
    	    	  		grille[i][j]==0&&   (grille[i][j+1]==-1 && grille[i-1][j]==1 && grille[i][j-1]==-1)||
    	        		grille[i][j]==0&&   (grille[i][j+1]==-1 && grille[i-1][j]==-1 && grille[i][j-1]==-1)||
    			  		//TEST2		
    	    			  		
    	    			 //TEST3  		
    	   				grille[i][j]==0&&   (grille[i+1][j]==-1 && grille[i-1][j]==1 && grille[i][j-1]==1)||
    	               	grille[i][j]==0&&	(grille[i+1][j]==1 && grille[i-1][j]==1 && grille[i][j-1]==-1)||
    	   				grille[i][j]==0&& 	(grille[i+1][j]==1 && grille[i-1][j]==-1 && grille[i][j-1]==1)||
    	   		        grille[i][j]==0&&   (grille[i+1][j]==1  && grille[i-1][j]==-1 && grille[i][j-1]==-1)||
    	   		        grille[i][j]==0&&   (grille[i+1][j]==-1 && grille[i-1][j]==1 && grille[i][j-1]==1)||
    	   		        grille[i][j]==0&&   (grille[i+1][j]==-1 && grille[i-1][j]==-1 && grille[i][j-1]==-1)||
    	   		        grille[i][j]==0&&   (grille[i+1][j]==-1 && grille[i-1][j]==-1 && grille[i][j-1]==-1)||
    	    	    	    			   
    	   		        grille[i][j]==0&&   (grille[i+1][j]==-1 && grille[i-1][j]==1 && grille[i][j-1]==1)||
    	   		        grille[i][j]==0&&   (grille[i+1][j]==-1 && grille[i-1][j]==1 && grille[i][j-1]==1)||
    	   		       	grille[i][j]==0&&   (grille[i+1][j]==-1 && grille[i-1][j]==-1 && grille[i][j-1]==1)||
    	   		   		grille[i][j]==0&&   (grille[i+1][j]==-1 && grille[i-1][j]==-1 && grille[i][j-1]==-1)||
    	   		   		grille[i][j]==0&&   (grille[i+1][j]==-1 && grille[i-1][j]==-1 && grille[i][j-1]==1)||
    	   		   		grille[i][j]==0&&  	(grille[i+1][j]==-1 && grille[i-1][j]==-1 && grille[i][j-1]==-1)||
    	  		   		grille[i][j]==0&& 	(grille[i+1][j]==-1 && grille[i-1][j]==1 && grille[i][j-1]==-1)||
    	    	    	    	    	   
    	   		   		grille[i][j]==0&&   (grille[i+1][j]==1 && grille[i-1][j]==1 && grille[i][j-1]==1)||
    	   		   		grille[i][j]==0&&   (grille[i+1][j]==1 && grille[i-1][j]==1 && grille[i][j-1]==1)||
    	   		  		grille[i][j]==0&&   (grille[i+1][j]==1 && grille[i-1][j]==-1 && grille[i][j-1]==1)||
    	   		  		grille[i][j]==0&&   (grille[i+1][j]==1 && grille[i-1][j]==1 && grille[i][j-1]==-1)||
    	   		  		grille[i][j]==0&&   (grille[i+1][j]==1 && grille[i-1][j]==-1 && grille[i][j-1]==-1)||
    	   		  		grille[i][j]==0&&   (grille[i+1][j]==1 && grille[i-1][j]==1 && grille[i][j-1]==-1)||
    	   		  		grille[i][j]==0&&   (grille[i+1][j]==1 && grille[i-1][j]==-1 && grille[i][j-1]==-1)||
    					//Test3
    	    	    			  		
    	    	    	//Test4
   		  				grille[i][j]==0&&   (grille[i+1][j]==-1 && grille[i][j+1]==1 && grille[i][j-1]==1)||
                       	grille[i][j]==0&&	(grille[i+1][j]==1 && grille[i][j+1]==-1 && grille[i][j-1]==-1)||
      					grille[i][j]==0&& 	(grille[i+1][j]==1 && grille[i][j+1]==1 && grille[i][j-1]==1)||
      			        grille[i][j]==0&&   (grille[i+1][j]==1 && grille[i][j+1]==-1 && grille[i][j-1]==-1)||
      			        grille[i][j]==0&&   (grille[i+1][j]==-1 && grille[i][j+1]==-1 && grille[i][j-1]==1)||
       			        grille[i][j]==0&&   (grille[i+1][j]==-1 && grille[i][j+1]==1 && grille[i][j-1]==-1)||
       			        grille[i][j]==0&&   (grille[i+1][j]==-1 && grille[i][j+1]==-1 && grille[i][j-1]==-1)||
    	    	    	    	    			   
       			        grille[i][j]==0&&   (grille[i+1][j]==-1 && grille[i][j+1]==1 && grille[i][j-1]==1)||
       			        grille[i][j]==0&&   (grille[i+1][j]==-1 && grille[i][j+1]==-1 && grille[i][j-1]==1)||
       			       	grille[i][j]==0&&   (grille[i+1][j]==-1 && grille[i][j+1]==-1 && grille[i][j-1]==1)||
       			   		grille[i][j]==0&&   (grille[i+1][j]==-1 && grille[i][j+1]==-1 && grille[i][j-1]==-1)||
       			   		grille[i][j]==0&&   (grille[i+1][j]==-1 && grille[i][j+1]==1 && grille[i][j-1]==1)||
      			   		grille[i][j]==0&&  	(grille[i+1][j]==-1 && grille[i][j+1]==1 && grille[i][j-1]==-1)||
       			   		grille[i][j]==0&& 	(grille[i+1][j]==-1 && grille[i][j+1]==-1 && grille[i][j-1]==-1)||
    	      	    	    	   
      			   		grille[i][j]==0&&   (grille[i+1][j]==1 && grille[i][j+1]==1 && grille[i][j-1]==1)||
      			   		grille[i][j]==0&&   (grille[i+1][j]==1 && grille[i][j+1]==-1 && grille[i][j-1]==1)||
     			  		grille[i][j]==0&&   (grille[i+1][j]==1 && grille[i][j+1]==1 && grille[i][j-1]==1)||
      			  		grille[i][j]==0&&   (grille[i+1][j]==1 && grille[i][j+1]==1 && grille[i][j-1]==-1)||
      			  		grille[i][j]==0&&   (grille[i+1][j]==1 && grille[i][j+1]==1 && grille[i][j-1]==-1)||
       			  		grille[i][j]==0&&   (grille[i+1][j]==1 && grille[i][j+1]==-1 && grille[i][j-1]==-1)||
    	    	  		grille[i][j]==0&&   (grille[i+1][j]==1 && grille[i][j+1]==-1 && grille[i][j-1]==-1)||
    				    //Test4
    	    	    	    			  		
    	    	    	    			  		
    					grille[i][j]==0&&   (grille[i+1][j]==-1 && grille[i][j+1]==1 && grille[i-1][j]==1 && grille[i][j-1]==1)||
                    	grille[i][j]==0&&	(grille[i+1][j]==1 && grille[i][j+1]==-1 && grille[i-1][j]==1 && grille[i][j-1]==-1)||
    					grille[i][j]==0&& 	(grille[i+1][j]==1 && grille[i][j+1]==1 && grille[i-1][j]==-1 && grille[i][j-1]==1)||
    			        grille[i][j]==0&&   (grille[i+1][j]==1 && grille[i][j+1]==-1 && grille[i-1][j]==-1 && grille[i][j-1]==-1)||
    			        grille[i][j]==0&&   (grille[i+1][j]==-1 && grille[i][j+1]==-1 && grille[i-1][j]==1 && grille[i][j-1]==1)||
    			        grille[i][j]==0&&   (grille[i+1][j]==-1 && grille[i][j+1]==1 && grille[i-1][j]==-1 && grille[i][j-1]==-1)||
    			        grille[i][j]==0&&   (grille[i+1][j]==-1 && grille[i][j+1]==-1 && grille[i-1][j]==-1 && grille[i][j-1]==-1)||
    	    			   
    			        grille[i][j]==0&&   (grille[i+1][j]==-1 && grille[i][j+1]==1 && grille[i-1][j]==1 && grille[i][j-1]==1)||
    			        grille[i][j]==0&&   (grille[i+1][j]==-1 && grille[i][j+1]==-1 && grille[i-1][j]==1 && grille[i][j-1]==1)||
    			       	grille[i][j]==0&&   (grille[i+1][j]==-1 && grille[i][j+1]==-1 && grille[i-1][j]==-1 && grille[i][j-1]==1)||
    			   		grille[i][j]==0&&   (grille[i+1][j]==-1 && grille[i][j+1]==-1 && grille[i-1][j]==-1 && grille[i][j-1]==-1)||
    			   		grille[i][j]==0&&   (grille[i+1][j]==-1 && grille[i][j+1]==1 && grille[i-1][j]==-1 && grille[i][j-1]==1)||
    			   		grille[i][j]==0&&  	(grille[i+1][j]==-1 && grille[i][j+1]==1 && grille[i-1][j]==-1 && grille[i][j-1]==-1)||
    			   		grille[i][j]==0&& 	(grille[i+1][j]==-1 && grille[i][j+1]==-1 && grille[i-1][j]==1 && grille[i][j-1]==-1)||
    	    	    	   
    			   		grille[i][j]==0&&   (grille[i+1][j]==1 && grille[i][j+1]==1 && grille[i-1][j]==1 && grille[i][j-1]==1)||
    			   		grille[i][j]==0&&   (grille[i+1][j]==1 && grille[i][j+1]==-1 && grille[i-1][j]==1 && grille[i][j-1]==1)||
    			  		grille[i][j]==0&&   (grille[i+1][j]==1 && grille[i][j+1]==1 && grille[i-1][j]==-1 && grille[i][j-1]==1)||
    			  		grille[i][j]==0&&   (grille[i+1][j]==1 && grille[i][j+1]==1 && grille[i-1][j]==1 && grille[i][j-1]==-1)||
    			  		grille[i][j]==0&&   (grille[i+1][j]==1 && grille[i][j+1]==1 && grille[i-1][j]==-1 && grille[i][j-1]==-1)||
    			  		grille[i][j]==0&&   (grille[i+1][j]==1 && grille[i][j+1]==-1 && grille[i-1][j]==1 && grille[i][j-1]==-1)||
    			  		grille[i][j]==0&&   (grille[i+1][j]==1 && grille[i][j+1]==-1 && grille[i-1][j]==-1 && grille[i][j-1]==-1)){
    			
    			
    				grille[i][j] = -1;
    				arretePas = false;
    				
    				if(arretePas == false) {
    					resoudre(grille);
    				}
    				
    			} 
    	   	} 
    	} 
    	    	
    	    
    	
    }	
      	
      	sortie = true;
      	return sortie;
    		
    
    	
    
       

    }
}