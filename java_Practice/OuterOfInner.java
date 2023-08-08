public class OuterOfInner {
    private int rv = 5;
    public class Inner{
        private int value =0;
        public int GetValue(){
            return value;
        }
        public void SetValue(int value){
            this.value = value;
        }
        public void addRv(){
            this.value = this.value + OuterOfInner.this.rv;

        }
        public void modRv(int value){
            rv = value;
        }
    }
}
