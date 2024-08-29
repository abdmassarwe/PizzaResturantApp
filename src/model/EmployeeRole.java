package model;

public enum EmployeeRole {
	front,
	back,
	serving,
	manager,
	delivery;
	
    @Override
    public String toString() {
        switch (this) {
            case front: return "קופאי";
            case back: return "אופה";
            case serving: return "שירות";
            case manager: return "מנהל";
            case delivery: return "שליח";
            default: throw new IllegalArgumentException();
        }
    }
}
