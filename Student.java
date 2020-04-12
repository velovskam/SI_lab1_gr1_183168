class Student {
	String index;
	String firstName;
	String lastName;

	ArrayList<Integer> labPoints = new ArrayList<Integer>();
	//TODO constructor
	Student(){ 
		this.index=index; 
		this.firstName=firstName; 
  		this.lastName=lastName; 
		this.list=list;
	}

	//TODO seters & getters
	//getters
	public Integer getIndex(){
		return index;
	}
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	//setters
	public void setIndex(Integer newIndex){
		this.index = newIndex;
	}
	public void setFirstName(String newFirstName){
		this.firstName = newFirstName;
	}
	public void setLastName(String newLastName){
		this.lastName = newLastName;
	}

	public double getAverage() {
		//TODO

	}

	public boolean hasSignature() {
		//TODO
	}
}
