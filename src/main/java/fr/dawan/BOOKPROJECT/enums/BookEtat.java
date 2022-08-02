package fr.dawan.BOOKPROJECT.enums;



public enum BookEtat {
	NEUF("Comme Neuf",80),
    MOYEN("Moyen",60),
    USE("Usé",30);

	private String abrev;
	private int pointb;
	private BookEtat(String abrev, int pointb) {
		this.abrev = abrev;
		this.pointb = pointb;
	}
	
	
	
	public String getAbrev() {
		return abrev;
	}



	public int getPointb() {
		return pointb;
	}



	

	

	
	
	
	

	   

	    
	
	
	
	
	
	
//       private String bookEtat;
//
//    BookEtat(String  bookEtat) {
//        this.bookEtat =  bookEtat;
//    }
// 
//    public String getUrl() {
//        return  bookEtat;
//    }

}
