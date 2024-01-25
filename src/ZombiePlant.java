public class ZombiePlant {
    private int potency;
    private int treatments;

    public ZombiePlant(int potency, int treatments) {
        this.potency = potency;
        this.treatments = treatments;
    }

    public int getPotency() {
        return potency;
    }

    public int treatmentsNeeded() {
        return treatments;
    }

    public boolean isDangerous() {
        if (treatments >=1){
            return true;
        } else {
            return false;
        }
    }

    public void treat(int treat) {
        if (treat <= potency && treat > 0 && treatments != 0) {
            treatments--;
        }else if (treat>potency){
            treatments++;
        }
    }
}