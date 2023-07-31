public class Technician extends Student{
        private String professionalRecord;
        public String getProfessionalRecord() {
                return professionalRecord;
        }

        public void setProfessionalRecord(String professionalRecord) {
                this.professionalRecord = professionalRecord;
        }

        public void toPractice(){
                System.out.println(this.getName() + " is practicing");
        }




}
