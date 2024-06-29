import java.util.Iterator;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Collections;
import java.util.HashMap ;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Main {
    public static ArrayList<Library> LibraryList = new ArrayList<>();
    public static HashMap<String, Category> CategoryList = new HashMap<>();
    public static ArrayList<Student> StudentList = new ArrayList<>();
    public static ArrayList<Admin> AdminList = new ArrayList<>();
    public static ArrayList<Staff> StaffList = new ArrayList<>();
    public static ArrayList<Masool> MasoolList = new ArrayList<>();
    public static ArrayList<Book> BookList = new ArrayList<>();
    public static ArrayList<Thesis> ThesisList = new ArrayList<>();
    public static ArrayList<GanjineBook> GanjineBookList = new ArrayList<>();
    public static ArrayList<SellingBook> SellingBookList = new ArrayList<>();
    public static ArrayList<Borrow> BorrowList = new ArrayList<>();
    public static ArrayList<Return> ReturnList = new ArrayList<>();
    public static ArrayList<Read> ReadList = new ArrayList<>();
    public static ArrayList<Comment> CommentList = new ArrayList<>();
    public static ArrayList<KolJarime> KolJarimeList = new ArrayList<>();
    public static class Library {

        private String shenase1;
        private String libname;
        private String start;
        private String tableNum;
        private String address;

        public Library(  String shenase1, String libname, String start, String tableNum, String address) {

            this.shenase1 = shenase1;
            this.libname = libname;
            this.start = start;
            this.tableNum = tableNum;
            this.address = address;
        }

        public String getShenase1() {
            return shenase1;
        }

        public void setShenase1(String shenase1) {
            this.shenase1 = shenase1;
        }

        public String getLibname() {
            return libname;
        }

        public void setLibname(String libname) {
            this.libname = libname;
        }

        public String getStart() {
            return start;
        }

        public void setStart(String start) {
            this.start = start;
        }

        public String getTableNum() {
            return tableNum;
        }

        public void setTableNum(String tableNum) {
            this.tableNum = tableNum;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }
    public static class Category {

        private String code;
        private String category1;
        private String dastebandi ;

        public Category(  String code, String category1 , String dastebandi) {
            this.code = code;
            this.category1 = category1;
            this.dastebandi = dastebandi;
        }


        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getCategory1() {
            return category1;
        }

        public void setCategory1(String category1) {
            this.category1 = category1;
        }

        public String getDastebandi() {return dastebandi;}

        public void setDastebandi(String dastebandi) {this.dastebandi = dastebandi;}

    }
    public static class User {
        private String id;
        private String passwd;
        private String name;
        private String lastname;
        private String nationalNum;
        private String year;
        private String address;

        public User( String id, String passwd, String name, String lastname, String nationalNum, String year, String address) {
            this.id = id;
            this.passwd = passwd;
            this.name = name;
            this.lastname = lastname;
            this.nationalNum = nationalNum;
            this.year = year;
            this.address = address;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getPasswd() {
            return passwd;
        }

        public void setPasswd(String passwd) {
            this.passwd = passwd;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public String getNationalNum() {
            return nationalNum;
        }

        public void setNationalNum(String nationalNum) {
            this.nationalNum = nationalNum;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }
    public static class Student extends User{
        public Student( String id, String passwd, String name, String lastname, String nationalNum, String year, String address) {
            super( id, passwd, name, lastname, nationalNum, year, address);
        }
    }
    public static class Admin {
        private String adminName ;
        private String adminPass ;
        public Admin(String adminName, String adminPass) {
            this.adminName = adminName;
            this.adminPass = adminPass;
        }
        public String getAdminName() {
            return adminName;
        }
        public void setAdminName(String adminName) {
            this.adminName = adminName;
        }
        public String getAdminPass() {
            return adminPass;
        }
        public void setAdminPass(String adminPass) {
            this.adminPass = adminPass;
        }
    }
    public static class Staff extends User{
        private String professorOrStaff ;
        public Staff(String id, String passwd, String name, String lastname, String nationalNum, String year, String address ,String professorOrStaff) {
            super(id, passwd, name, lastname, nationalNum, year, address);
            this.professorOrStaff = professorOrStaff;
        }
        public String getProfessorOrStaff() {
            return this.professorOrStaff;
        }

        public void setProfessorOrStaff(String professorOrStaff) {
            this.professorOrStaff = professorOrStaff;
        }
    }
    public static class Masool extends User{
        private String libcode ;
        public Masool(String id, String passwd, String name, String lastname, String nationalNum, String year, String address , String libcode) {
            super(id, passwd, name, lastname, nationalNum, year, address);
            this.libcode = libcode ;
        }
        public String getLibcode() {
            return this.libcode;
        }
        public void setLibcode(String libcode) {
            this.libcode = libcode;
        }
    }
    public static class Readable{
        private String managerName ;
        private String managerpass ;
        private String Bcode;
        private String onvan;
        private String creator;
        private String pub;
        private String year2;
        private String code;
        private String shenase2;
        public Readable(String managerName, String managerpass, String Bcode, String onvan, String creator, String pub, String year2, String code, String shenase2) {
            this.managerName = managerName ;
            this.managerpass = managerpass ;
            this.Bcode = Bcode;
            this.onvan = onvan;
            this.creator = creator;
            this.pub = pub;
            this.year2 = year2;
            this.code = code;
            this.shenase2 = shenase2;
        }
        public String getManagerName() {
            return managerName;
        }
        public void setManagerName(String managerName) {
            this.managerName = managerName;
        }
        public String getManagerpass() {
            return managerpass;
        }
        public void setManagerpass(String managerpass) {
            this.managerpass = managerpass;
        }

        public String getBcode() {
            return Bcode;
        }

        public void setBcode(String Bcode) {
            this.Bcode = Bcode;
        }

        public String getOnvan() {
            return onvan;
        }

        public void setOnvan(String onvan) {
            this.onvan = onvan;
        }

        public String getCreator() {
            return creator;
        }

        public void setCreator(String creator) {
            this.creator = creator;
        }

        public String getPub() {
            return pub;
        }

        public void setPub(String pub) {
            this.pub = pub;
        }

        public String getYear2() {
            return year2;
        }

        public void setYear2(String year2) {
            this.year2 = year2;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getShenase2() {
            return shenase2;
        }

        public void setShenase2(String shenase2) {
            this.shenase2 = shenase2;
        }
    }
    public static class Book extends Readable{
        private String existingNum;

        public Book(String managerName, String managerpass, String Bcode, String onvan, String creator, String pub, String year2,String existingNum , String code, String shenase2) {
            super(managerName, managerpass, Bcode, onvan, creator, pub, year2, code, shenase2);
            this.existingNum = existingNum ;
        }

        public String getExistingNum() {
            return this.existingNum;
        }
        public void setExistingNum(String existingNum) {
            this.existingNum = existingNum;
        }
    }
    public static class Thesis extends Readable{
        private boolean isBorrowed = false;
        public Thesis(String managerName, String managerpass, String Bcode, String onvan, String creator, String pub, String year2, String code, String shenase2) {
            super(managerName, managerpass, Bcode, onvan, creator, pub, year2, code, shenase2);
        }
        public boolean isBorrowed() {
            return isBorrowed;
        }

        public void setBorrowed(boolean borrowed) {
            isBorrowed = borrowed;
        }
    }
    public static class GanjineBook extends Readable{
        private String someone;

        public GanjineBook(String managerName, String managerpass, String Bcode, String onvan, String creator, String pub, String year2,String someone , String code, String shenase2) {
            super(managerName, managerpass, Bcode, onvan, creator, pub, year2, code, shenase2);
            this.someone = someone;
        }

        public String getSomeone() {
            return this.someone;
        }
        public void setSomeone(String someone) {
            this.someone = someone;
        }
    }
    public static class SellingBook extends Readable{
        private String existingNum;
        private String gheymat;
        private String takhfif;

        public SellingBook(String managerName, String managerpass, String Bcode, String onvan, String creator, String pub, String year2,  String existingNum, String gheymat, String takhfif, String code, String shenase2) {
            super(managerName, managerpass, Bcode, onvan, creator, pub, year2, code, shenase2);
            this.existingNum = existingNum;
            this.gheymat = gheymat;
            this.takhfif = takhfif;
        }

        public String getExistingNum() {
            return this.existingNum;
        }
        public void setExistingNum(String existingNum) {
            this.existingNum = existingNum;
        }
        public String getGheymat() {
            return this.gheymat;
        }
        public void setGheymat(String gheymat) {
            this.gheymat = gheymat;
        }
        public String getTakhfif() {
            return this.takhfif;
        }
        public void setTakhfif(String takhfif) {
            this.takhfif = takhfif;
        }
    }
    public static class Dastorat{
        private String id;
        private String password;
        private String libCode;
        private String bookCode;

        public Dastorat(String id, String password, String libCode, String bookCode) {
            this.id = id;
            this.password = password;
            this.libCode = libCode;
            this.bookCode = bookCode;
        }

        public String getId() {return id;}

        public void setId(String id) {this.id = id;}

        public String getPassword() {return password;}

        public void setPassword(String password) {this.password = password;}

        public String getLibCode() {return libCode;}

        public void setLibCode(String libCode) {this.libCode = libCode;}

        public String getBookCode() {return bookCode;}

        public void setBookCode(String bookCode) {this.bookCode = bookCode;}

    }
    public static class Borrow extends Dastorat {
        private String date;
        private String time;
        public Borrow(String id, String password, String libCode, String bookCode , String date , String time) {
            super(id, password, libCode, bookCode);
            this.date = date;
            this.time = time;
        }
        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

    }
    public static class Buy extends Dastorat{
        public Buy(String id, String password, String libCode, String bookCode) {
            super(id, password, libCode, bookCode);
        }
    }
    public static class Return extends Dastorat{
        private String date2;
        private String time2;

        public Return(String id, String password, String libCode, String bookCode , String date2 , String time2) {
            super(id, password, libCode, bookCode);
            this.date2 = date2;
            this.time2 = time2;
        }
        public String getDate2() {
            return date2;
        }

        public void setDate2(String date2) {
            this.date2 = date2;
        }

        public String getTime2() {
            return time2;
        }

        public void setTime2(String time2) {
            this.time2 = time2;
        }
    }
    public static class Read extends Dastorat {
        private String date;
        private String time;
        public Read(String id, String password, String libCode, String bookCode , String date , String time) {
            super(id , password , libCode , bookCode);
            this.date = date;
            this.time = time;
        }
        public String getDate() {
            return date;
        }
        public void setDate(String date) {
            this.date = date;
        }
        public String getTime() {
            return time;
        }
        public void setTime(String time) {
            this.time = time;
        }

    }
    public static class Comment extends Dastorat {
        private String cmmnt;
        public Comment(String id, String password, String libCode, String bookCode , String cmmnt) {
            super(id, password, libCode, bookCode);
            this.cmmnt = cmmnt;
        }
        public String getCmmnt() {
            return cmmnt;
        }
        public void setCmmnt(String cmmnt) {
            this.cmmnt = cmmnt;
        }

    }
    public static class KolJarime {
        private long jarime;
        public KolJarime(long jarime) {
            this.jarime = jarime;
        }
        public long getJarime() {
            return jarime;
        }
        public void setJarime(long jarime) {
            this.jarime = jarime;
        }

    }
    public static boolean checkexistingUser(String id , String password){
        for (Student stu : StudentList){
            if (stu.getId().equals(id) && !stu.getPasswd().equals(password)){
                System.out.println("invalid-pass");
                return true;
            }
        }
        for (Staff stf : StaffList){
            if (stf.getId().equals(id) && !stf.getPasswd().equals(password)){
                System.out.println("invalid-pass");
                return true;
            }
        }
        for (Masool mss : MasoolList){
            if (mss.getId().equals(id) && !mss.getPasswd().equals(password)){
                System.out.println("invalid-pass");
                return true;
            }
        }
        return false;
    }
    public static boolean checkexistingUser2(String id , String password){
        for (Student stu : StudentList){
            if (stu.getId().equals(id) && !stu.getPasswd().equals(password)){
                System.out.println("invalid-pass");
                return true;
            }
        }
        for (Staff stf : StaffList){
            if (stf.getId().equals(id) && !stf.getPasswd().equals(password)){
                System.out.println("invalid-pass");
                return true;
            }
        }
        return false;
    }
    public static boolean checkAdmin(String AdminName){
        for (Student stu : StudentList){
            if (stu.getId().equals(AdminName)){
                System.out.println("permission-denied");
                return true;
            }
        }
        for (Staff stf : StaffList){
            if (stf.getId().equals(AdminName)){
                System.out.println("permission-denied");
                return true;
            }
        }
        for (Masool mss : MasoolList){
            if (mss.getId().equals(AdminName)){
                System.out.println("permission-denied");
                return true;
            }
        }
        return false;
    }
    public static boolean checkManager(String ManagerName){
        for (Student stu : StudentList){
            if (stu.getId().equals(ManagerName)){
                System.out.println("permission-denied");
                return true;
            }
        }
        for (Staff stf : StaffList){
            if (stf.getId().equals(ManagerName)){
                System.out.println("permission-denied");
                return true;
            }
        }
        for (Admin admin : AdminList){
            if (admin.getAdminName().equals(ManagerName)){
                System.out.println("permission-denied");
                return true;
            }
        }
        return false;
    }
    public static boolean checkExistingAdmin(String AdminName , String AdminPass){
        boolean exist = false;
        for (Admin existingAdmin : AdminList){
            if (existingAdmin.getAdminName().equals(AdminName)){
                exist = true;
                break;
            }
        }
        if (!exist){
            System.out.println("not-found");
            return true;
        }
        exist = false;
        for (Admin existingAdmin : AdminList){
            if (existingAdmin.getAdminName().equals(AdminName)){
                if (!existingAdmin.getAdminPass().equals(AdminPass)){
                    exist = true ;
                    break;
                }
            }
        }
        if (exist){
            System.out.println("invalid-pass");
            return true;
        }
        return false;
    }
    public static boolean checkExistingManager(String ManagerName , String ManagerPass){
        boolean exist = false;
        for (Masool masool1 : MasoolList){
            if (masool1.getId().equals(ManagerName)){
                exist = true;
                break;
            }
        }
        if (!exist){
            System.out.println("not-found");
            return true;
        }
        exist = false;
        for (Masool masool1 : MasoolList){
            if (masool1.getId().equals(ManagerName)){
                if (!masool1.getPasswd().equals(ManagerPass)){
                    exist = true ;
                    break;
                }
            }
        }
        if (exist){
            System.out.println("invalid-pass");
            return true;
        }
        return false;
    }
    public static boolean checkCat(String code) {
        if (!CategoryList.containsKey(code)) {
            System.out.println("not-found");
            return true;
        }
        return false;
    }
    public static boolean checkLib(String shenase2){
        boolean isDuplicate = false;
        for (Library existingLib : LibraryList) {
            if (existingLib.getShenase1().equals(shenase2)) {
                isDuplicate = true;
                break;
            }
        }
        if (!isDuplicate) {
            System.out.println("not-found");
            return true;
        }
        return false;
    }
    public static boolean checkManagerAndLib(String ManagerName , String Shenase2) {
        for (Masool masool : MasoolList) {
            if (masool.getId().equals(ManagerName)) {
                if (masool.getLibcode().equals(Shenase2)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void DecreasethesisCount(String Bcode, String Shenase) {
        for (Thesis existingThesis : ThesisList) {
            if (existingThesis.getBcode().equals(Bcode) && existingThesis.getShenase2().equals(Shenase)
                    && (!existingThesis.isBorrowed())) {
                existingThesis.setBorrowed(true);
                System.out.println("success");
                return;
            }
        }
        System.out.println("not-allowed");
    }
    public static void IncreasethesisCount(String Bcode, String Shenase) {
        for (Thesis existingThesis : ThesisList) {
            if (existingThesis.getBcode().equals(Bcode) && existingThesis.getShenase2().equals(Shenase)) {
                existingThesis.setBorrowed(false);
                break;
            }
        }
    }
    public static void DecreaseBookCount(String Bcode, String Shenase) {
        for (Book existingBook : BookList) {
            if (existingBook.getBcode().equals(Bcode) && existingBook.getShenase2().equals(Shenase)) {
                int number = Integer.parseInt(existingBook.getExistingNum());
                if (number == 0) {
                    System.out.println("not-allowed");
                    return;
                }
                int newNumber = number - 1;
                existingBook.setExistingNum(String.valueOf(newNumber));
                System.out.println("success");
                for (int i = 0; i < BookList.size(); i++) {
                    if (BookList.get(i).getBcode().equals(Bcode) && BookList.get(i).getShenase2().equals(Shenase)) {
                        BookList.set(i, existingBook);
                        break;
                    }
                }
                return;
            }
        }
        System.out.println("not-found");
    }
    public static void IncreaseBookCount(String Bcode, String Shenase) {
        for (Book existingBook : BookList) {
            if (existingBook.getBcode().equals(Bcode) && existingBook.getShenase2().equals(Shenase)) {
                int number = Integer.parseInt(existingBook.getExistingNum());
                int newNumber = number + 1;
                String afterChange = String.valueOf(newNumber);
                existingBook.setExistingNum(afterChange);
                for (int i = 0; i < BookList.size(); i++) {
                    if (BookList.get(i).getBcode().equals(Bcode) && BookList.get(i).getShenase2().equals(Shenase)) {
                        BookList.set(i, existingBook);
                        break;
                    }
                }
            }
        }
    }
    public static void DecreaseSeelingBook(String Bcode, String Shenase) {
        for (SellingBook existingBook : SellingBookList) {
            if (existingBook.getBcode().equals(Bcode) && existingBook.getShenase2().equals(Shenase)) {
                int number = Integer.parseInt(existingBook.getExistingNum());
                if (number == 0) {
                    System.out.println("not-allowed");
                    return;
                }
                int newNumber = number - 1;
                existingBook.setExistingNum(String.valueOf(newNumber));
                System.out.println("success");
                for (int i = 0; i < SellingBookList.size(); i++) {
                    if (SellingBookList.get(i).getBcode().equals(Bcode) && SellingBookList.get(i).getShenase2().equals(Shenase)) {
                        SellingBookList.set(i, existingBook);
                        break;
                    }
                }
                return;
            }
        }
        System.out.println("not-found");
    }
    public static boolean checkDuplicade(String id){
        for (Student existingStudent : StudentList) {
            if (existingStudent.getId().equals(id)) {
                return true;
            }
        }
        for (Staff existingStaff: StaffList) {
            if (existingStaff.getId().equals(id)) {
                return true;
            }
        }
        for (Masool masool1 : MasoolList) {
            if (masool1.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
    public static boolean existInBorrowList(String Bcode , String libCode , int sum2){
        for (Borrow borrow : BorrowList){
            if (borrow.getBookCode().equals(Bcode) && borrow.getLibCode().equals(libCode)){
                sum2-- ;
                return true;
            }
        }
        return false;
    }
    public static void AddAdmin(String AdminName, String AdminPass){
        Admin admin = new Admin(AdminName , AdminPass);
        boolean isDuplicate = false;
        for (Admin existingAdmin : AdminList) {
            if (existingAdmin.getAdminName().equals(AdminName)){
                isDuplicate = true;
                break;
            }
        }

        if (isDuplicate) {
            System.out.println("duplicate-id");
        } else {
            AdminList.add(admin);
        }
    }
    public static void AddLib(String AdminName, String AdminPass, String shenase1, String libname, String start, String tableNum, String address) {
        Library library = new Library( shenase1, libname, start, tableNum, address);
        if (checkexistingUser(AdminName , AdminPass)){
            return;
        }
        if (checkAdmin(AdminName)){
            return;
        }
        if ( checkExistingAdmin(AdminName , AdminPass)){
            return;
        }
        boolean isDuplicate = false;
        for (Library existingLibrary : LibraryList) {
            if (existingLibrary.getShenase1().equals(shenase1)){
                isDuplicate = true;
                break;
            }
        }

        if (isDuplicate) {
            System.out.println("duplicate-id");
        } else {
            LibraryList.add(library);
            System.out.println("success");
        }
    }
    public static void AddCat(String AdminName, String AdminPass, String code, String category1, String dastebandi) {
        if (checkexistingUser(AdminName , AdminPass)){
            return;
        }
        if (checkexistingUser(AdminName , AdminPass)){
            return;
        }
        if (checkAdmin(AdminName)) {
            return;
        }
        if (checkExistingAdmin(AdminName, AdminPass)) {
            return;
        }
        if (CategoryList.containsKey(code)) {
            System.out.println("duplicate-id");
            return;
        }
        boolean zirdast = dastebandi.equals("null") || CategoryList.containsKey(dastebandi);
        if (!zirdast) {
            System.out.println("not-found");
        } else {
            Category category = new Category(code, category1, dastebandi);
            CategoryList.put(code, category);
            System.out.println("success");
        }
    }
    public static void AddStu(String AdminName, String AdminPass, String id, String passwd, String name, String lastname, String nationalNum, String year, String address) {
        Student student = new Student( id , passwd ,name, lastname, nationalNum, year, address);
        if (checkexistingUser(AdminName , AdminPass)){
            return;
        }
        if (checkAdmin(AdminName)){
            return;
        }
        if ( checkExistingAdmin(AdminName , AdminPass)){
            return;
        }
        if (checkDuplicade(id)) {
            System.out.println("duplicate-id");
            return;
        }
        StudentList.add(student);
        System.out.println("success");

    }
    public static void AddStf(String AdminName, String AdminPass, String id, String passwd, String name, String lastname, String nationalNum, String year, String address, String professorOrStaff) {
        Staff staff = new Staff( id , passwd ,name, lastname, nationalNum, year, address, professorOrStaff);
        if (checkexistingUser(AdminName , AdminPass)){
            return;
        }
        if (checkAdmin(AdminName)){
            return;
        }
        if ( checkExistingAdmin(AdminName , AdminPass)){
            return;
        }
        if (checkDuplicade(id)) {
            System.out.println("duplicate-id");
        }
        else if (professorOrStaff.equals("staff")){
            StaffList.add(staff);
            System.out.println("success");
        }
        else if (professorOrStaff.equals("professor")) {
            StaffList.add(staff);
            System.out.println("success");
        }
        else {
            System.out.println("not-found");
        }
    }
    public static void AddManager(String AdminName, String AdminPass, String id, String passwd, String name, String lastname, String nationalNum, String year, String address, String libcode) {
        Masool masool = new Masool( id , passwd ,name, lastname, nationalNum, year, address , libcode);
        if (checkexistingUser(AdminName , AdminPass)){
            return;
        }
        if (checkAdmin(AdminName)){
            return;
        }
        if ( checkExistingAdmin(AdminName , AdminPass)){
            return;
        }
        if (checkDuplicade(id)) {
            System.out.println("duplicate-id");
            return;
        }
        boolean exist2 = false ;
        for (Library lib : LibraryList){
            if (lib.getShenase1().equals(libcode)) {
                MasoolList.add(masool);
                System.out.println("success");
                exist2 = true;
                break;
            }
        }
        if (!exist2){
            System.out.println("not-found");
        }
    }
    public static void RemoveUser(String AdminName, String AdminPass, String id){
        if (checkexistingUser(AdminName , AdminPass)){
            return;
        }
        if (checkAdmin(AdminName)){
            return;
        }
        if ( checkExistingAdmin(AdminName , AdminPass)){
            return;
        }
        for (Borrow borrow : BorrowList){
            if (borrow.getId().equals(id)){
                System.out.println("not-allowed");
                return;
            }
        }
        boolean exist = false;
        Iterator<Student> studentIterator = StudentList.iterator();
        while (studentIterator.hasNext()) {
            Student stu = studentIterator.next();
            if (stu.getId().equals(id)) {
                studentIterator.remove();
                exist = true;
                break;
            }
        }
        Iterator<Staff> staffIterator = StaffList.iterator();
        while (staffIterator.hasNext()) {
            Staff stf = staffIterator.next();
            if (stf.getId().equals(id)) {
                staffIterator.remove();
                exist = true;
                break;
            }
        }
        Iterator<Masool> masoolIterator = MasoolList.iterator();
        while (masoolIterator.hasNext()) {
            Masool mss = masoolIterator.next();
            if (mss.getId().equals(id)) {
                masoolIterator.remove();
                exist = true;
                break;
            }
        }

        if (!exist) {
            System.out.println("not-found");
        }
        else {
            System.out.println("success");
        }
    }
    public static void AddBook(String ManagerName, String ManagerPass, String Bcode, String onvan, String creator, String pub, String year2, String existnum, String code, String shenase2){
        Book book= new Book(ManagerName, ManagerPass, Bcode, onvan, creator, pub, year2, existnum, code, shenase2);
        if (checkexistingUser2(ManagerName , ManagerPass)){
            return;
        }
        if (checkManager(ManagerName)){
            return;
        }
        if (checkExistingManager(ManagerName , ManagerPass)){
            return;
        }
        if (code.equals("null")) {
        }
        else if (checkCat(code)){
            return;
        }
        if (checkLib(shenase2)){
            return;
        }
        if (!checkManagerAndLib(ManagerName , shenase2)){
            System.out.println("permission-denied");
            return;
        }
        boolean isDuplicate = false;
        for (SellingBook existingBook : SellingBookList) {
            if (existingBook.getBcode().equals(Bcode) && existingBook.getShenase2().equals(shenase2)) {
                isDuplicate = true;
                break;
            }
        }
        if (isDuplicate) {
            System.out.println("duplicate-id");
            return;
        }
        isDuplicate = false;
        for (Book existingBookData : BookList) {
            if (existingBookData.getBcode().equals(Bcode) && existingBookData.getShenase2().equals(shenase2)) {
                isDuplicate = true;
                break;
            }
        }
        if (isDuplicate) {
            System.out.println("duplicate-id");
            return;
        }
        isDuplicate = false;
        for (GanjineBook existingBook : GanjineBookList) {
            if (existingBook.getBcode().equals(Bcode) && existingBook.getShenase2().equals(shenase2)) {
                isDuplicate = true;
                break;
            }
        }
        if (isDuplicate) {
            System.out.println("duplicate-id");
        }
        else {
            BookList.add(book);
            System.out.println("success");
        }
    }
    public static void AddThesis(String ManagerName, String ManagerPass, String Bcode, String onvan, String creator, String pub, String year2, String code, String shenase2){
        Thesis thesis= new Thesis(ManagerName, ManagerPass, Bcode, onvan, creator, pub, year2, code, shenase2);
        if (checkexistingUser2(ManagerName , ManagerPass)){
            return;
        }
        if (checkManager(ManagerName)){
            return;
        }
        if (checkExistingManager(ManagerName , ManagerPass)){
            return;
        }
        if (code.equals("null")) {
        }
        else {
            if (checkCat(code)){
                return;
            }
        }
        if (checkLib(shenase2)){
            return;
        }
        if (!checkManagerAndLib(ManagerName , shenase2)){
            System.out.println("permission-denied");
            return;
        }
        boolean isDuplicate = false;
        for (Thesis existingThesis : ThesisList) {
            if (existingThesis.getBcode().equals(Bcode) && existingThesis.getShenase2().equals(shenase2)) {
                isDuplicate = true;
                break;
            }
        }
        if (isDuplicate) {
            System.out.println("duplicate-id");
        } else {
            ThesisList.add(thesis);
            System.out.println("success");
        }
    }
    public static void AddGanjine(String ManagerName, String ManagerPass, String Bcode, String onvan, String creator, String pub, String year2, String someone, String code, String shenase2){
        GanjineBook ganjineBook= new GanjineBook(ManagerName, ManagerPass, Bcode, onvan, creator, pub, year2, someone, code, shenase2);
        if (checkexistingUser2(ManagerName , ManagerPass)){
            return;
        }
        if (checkManager(ManagerName)){
            return;
        }
        if (checkExistingManager(ManagerName , ManagerPass)){
            return;
        }
        if (code.equals("null")) {
        }
        else {
            if (checkCat(code)){
                return;
            }
        }
        if (checkLib(shenase2)){
            return;
        }
        if (!checkManagerAndLib(ManagerName , shenase2)){
            System.out.println("permission-denied");
            return;
        }
        boolean isDuplicate = false;
        for (SellingBook existingBook : SellingBookList) {
            if (existingBook.getBcode().equals(Bcode) && existingBook.getShenase2().equals(shenase2)) {
                isDuplicate = true;
                break;
            }
        }
        if (isDuplicate) {
            System.out.println("duplicate-id");
            return;
        }
        isDuplicate = false;
        for (Book existingBookData : BookList) {
            if (existingBookData.getBcode().equals(Bcode) && existingBookData.getShenase2().equals(shenase2)) {
                isDuplicate = true;
                break;
            }
        }
        if (isDuplicate) {
            System.out.println("duplicate-id");
            return;
        }
        isDuplicate = false;
        for (GanjineBook existingBook : GanjineBookList) {
            if (existingBook.getBcode().equals(Bcode) && existingBook.getShenase2().equals(shenase2)) {
                isDuplicate = true;
                break;
            }
        }
        if (isDuplicate) {
            System.out.println("duplicate-id");
        }
        else {
            GanjineBookList.add(ganjineBook);
            System.out.println("success");
        }
    }
    public static void AddSellingBook(String ManagerName, String ManagerPass, String Bcode, String onvan, String creator, String pub, String year2, String existingNum, String gheymat, String takhfif, String code, String shenase2){
        SellingBook sellingBook = new SellingBook(ManagerName, ManagerPass, Bcode, onvan, creator, pub, year2, existingNum , gheymat , takhfif, code, shenase2);
        if (checkexistingUser2(ManagerName , ManagerPass)){
            return;
        }
        if (checkManager(ManagerName)){
            return;
        }
        if (checkExistingManager(ManagerName , ManagerPass)){
            return;
        }
        if (code.equals("null")) {
        }
        else {
            if (checkCat(code)){
                return;
            }
        }
        if (checkLib(shenase2)){
            return;
        }
        if (!checkManagerAndLib(ManagerName , shenase2)){
            System.out.println("permission-denied");
            return;
        }
        boolean isDuplicate = false;
        for (SellingBook existingBook : SellingBookList) {
            if (existingBook.getBcode().equals(Bcode) && existingBook.getShenase2().equals(shenase2)) {
                isDuplicate = true;
                break;
            }
        }
        if (isDuplicate) {
            System.out.println("duplicate-id");
            return;
        }
        isDuplicate = false;
        for (Book existingBookData : BookList) {
            if (existingBookData.getBcode().equals(Bcode) && existingBookData.getShenase2().equals(shenase2)) {
                isDuplicate = true;
                break;
            }
        }
        if (isDuplicate) {
            System.out.println("duplicate-id");
            return;
        }
        isDuplicate = false;
        for (GanjineBook existingBook : GanjineBookList) {
            if (existingBook.getBcode().equals(Bcode) && existingBook.getShenase2().equals(shenase2)) {
                isDuplicate = true;
                break;
            }
        }
        if (isDuplicate) {
            System.out.println("duplicate-id");
        }
        else {
            SellingBookList.add(sellingBook);
            System.out.println("success");
        }
    }
    public static void RemoveResource(String ManagerName, String ManagerPass, String Bcode, String Shenase2) {
        if (checkexistingUser2(ManagerName , ManagerPass)){
            return;
        }
        if (checkManager(ManagerName)){
            return;
        }
        if (checkExistingManager(ManagerName , ManagerPass)){
            return;
        }
        if (checkLib(Shenase2)){
            return;
        }
        if (!checkManagerAndLib(ManagerName , Shenase2)){
            System.out.println("permission-denied");
            return;
        }
        for (Borrow borrow : BorrowList){
            if (borrow.getLibCode().equals(Shenase2) && borrow.getBookCode().equals(Bcode)){
                System.out.println("not-allowed");
                return;
            }
        }
        boolean exist = false;
        Iterator<Book> bookIterator = BookList.iterator();
        while (bookIterator.hasNext()) {
            Book book = bookIterator.next();
            if (book.getBcode().equals(Bcode) && book.getShenase2().equals(Shenase2)) {
                bookIterator.remove();
                exist = true;
                break;
            }
        }

        Iterator<Thesis> thesisIterator = ThesisList.iterator();
        while (thesisIterator.hasNext()) {
            Thesis thesis = thesisIterator.next();
            if (thesis.getBcode().equals(Bcode) && thesis.getShenase2().equals(Shenase2)) {
                thesisIterator.remove();
                exist = true;
                break;
            }
        }

        Iterator<GanjineBook> ganjineBookIterator = GanjineBookList.iterator();
        while (ganjineBookIterator.hasNext()) {
            GanjineBook ganjineBook = ganjineBookIterator.next();
            if (ganjineBook.getBcode().equals(Bcode) && ganjineBook.getShenase2().equals(Shenase2)) {
                ganjineBookIterator.remove();
                exist = true;
                break;
            }
        }

        Iterator<SellingBook> seelingBookIterator = SellingBookList.iterator();
        while (seelingBookIterator.hasNext()) {
            SellingBook seelingBook = seelingBookIterator.next();
            if (seelingBook.getBcode().equals(Bcode) && seelingBook.getShenase2().equals(Shenase2)) {
                seelingBookIterator.remove();
                exist = true;
                break;
            }
        }

        if (!exist) {
            System.out.println("not-found");
        }
        else {
            System.out.println("success");
        }
    }
    public static void BorrowBook(String id, String passwd, String shenase1, String shenase2, String date, String time) {
        Borrow borrow = new Borrow(id, passwd, shenase1, shenase2, date, time);
        Student foundStudent = null;
        Staff foundStaff = null;
        boolean stu = false;
        boolean stf = false;
        for (Student existingStudent : StudentList) {
            if (existingStudent.getId().equals(id)) {
                foundStudent = existingStudent;
                break;
            }
        }
        if (foundStudent != null) {
            if (foundStudent.getPasswd().equals(passwd)) {
                stu = true;
            } else {
                System.out.println("invalid-pass");
                return;
            }
        } else {
            for (Staff existingStaff : StaffList) {
                if (existingStaff.getId().equals(id)) {
                    foundStaff = existingStaff;
                    break;
                }
            }
            if (foundStaff != null) {
                if (foundStaff.getPasswd().equals(passwd)) {
                    stf = true;
                } else {
                    System.out.println("invalid-pass");
                    return;
                }
            } else {
                System.out.println("not-found");
                return;
            }
        }
        boolean exist = false;
        for (Library existingLibrary : LibraryList) {
            if (existingLibrary.getShenase1().equals(shenase1)) {
                exist = true;
                break;
            }
        }
        if (!exist) {
            System.out.println("not-found");
            return;
        }
        for (GanjineBook ganjineBook : GanjineBookList){
            if (ganjineBook.getBcode().equals(shenase2) && ganjineBook.getShenase2().equals(shenase1)){
                System.out.println("not-allowed");
                return;
            }
        }
        for (SellingBook seelingBook : SellingBookList){
            if (seelingBook.getBcode().equals(shenase2) && seelingBook.getShenase2().equals(shenase1)){
                System.out.println("not-allowed");
                return;
            }
        }
        boolean isBook = false;
        boolean isThesis = false;
        for (Book existingBook : BookList) {
            if (existingBook.getBcode().equals(shenase2) && existingBook.getShenase2().equals(shenase1)
                    && !existingBook.getExistingNum().equals("0")) {
                isBook = true ;
                break;
            } else if (existingBook.getBcode().equals(shenase2) && existingBook.getShenase2().equals(shenase1)
                    && existingBook.getExistingNum().equals("0")) {
                System.out.println("not-allowed");
                return;
            }
        }
        if (!isBook) {
            boolean brrwed = false;
            for (Thesis existingThesis : ThesisList) {
                if (existingThesis.getBcode().equals(shenase2) && existingThesis.getShenase2().equals(shenase1)) {
                    if (!existingThesis.isBorrowed()) {
                        brrwed = true;
                    }
                    isThesis = true;
                    break;
                }
            }
            if (!isThesis) {
                System.out.println("not-found");
                return;
            } else if (!brrwed) {
                System.out.println("not-allowed");
                return;
            }
        }
        for (Borrow borrow1 : BorrowList) {
            if (borrow1.getId().equals(id) && borrow1.getBookCode().equals(shenase2) && borrow1.getLibCode().equals(shenase1)) {
                System.out.println("not-allowed");
                return;
            }
        }
        int sum = 0;
        for (Borrow brw : BorrowList) {
            if (brw.getId().equals(id)) {
                sum++;
            }
        }
        if (stu && sum >= 3) {
            System.out.println("not-allowed");
            return;
        }
        if (stf && sum >= 5) {
            System.out.println("not-allowed");
            return;
        }
        long hours;
        for (Borrow brw : BorrowList) {
            if (brw.getId().equals(id) && brw.getLibCode().equals(shenase1)) {
                String startDateTimeString = (date + "-" + time);
                String endDateTimeString = (brw.getDate() + "-" + brw.getTime());
                LocalDateTime startDateTime = LocalDateTime.parse(startDateTimeString, DateTimeFormatter.ofPattern("y-M-d-H:m"));
                LocalDateTime endDateTime = LocalDateTime.parse(endDateTimeString, DateTimeFormatter.ofPattern("y-M-d-H:m"));
                Duration duration = Duration.between(endDateTime, startDateTime);
                hours = duration.toHours();
                if (isBook){
                    if (foundStudent != null){
                        if (hours > 240){
                            System.out.println("not-allowed");
                            return;
                        }
                    }
                    if (foundStaff != null){
                        if (hours > 336){
                            System.out.println("not-allowed");
                            return;
                        }
                    }
                }
                if (isThesis){
                    if (foundStudent != null){
                        if (hours > 168){
                            System.out.println("not-allowed");
                            return;
                        }
                    }
                    if (foundStaff != null){
                        if (hours > 240){
                            System.out.println("not-allowed");
                            return;
                        }
                    }
                }
            }
        }
        BorrowList.add(borrow);
        //یکی از تعداد کتاب ها کم شد
        for (Book existingBook : BookList) {
            if (existingBook.getBcode().equals(shenase2) && existingBook.getShenase2().equals(shenase1)) {
                DecreaseBookCount(shenase2, shenase1);
                break;
            }
        }
        for (Thesis existingThesis : ThesisList) {
            if (existingThesis.getBcode().equals(shenase2) && existingThesis.getShenase2().equals(shenase1)) {
                DecreasethesisCount(shenase2, shenase1);
                break;
            }
        }
    }
    public static void ReturnBook(String id, String passwd, String shenase1, String shenase2, String date2, String time2) {
        Return return1 = new Return(id, passwd, shenase1, shenase2, date2, time2);
        Student foundStudent = null;
        for (Student existingStudent : StudentList) {
            if (existingStudent.getId().equals(id)) {
                foundStudent = existingStudent;
                break;
            }
        }
        if (foundStudent != null) {
            if (foundStudent.getPasswd().equals(passwd)) {
            } else {
                System.out.println("invalid-pass");
                return;
            }
        } else {
            Staff foundStaff = null;
            for (Staff existingStaff : StaffList) {
                if (existingStaff.getId().equals(id)) {
                    foundStaff = existingStaff;
                    break;
                }
            }
            if (foundStaff != null) {
                if (foundStaff.getPasswd().equals(passwd)) {
                } else {
                    System.out.println("invalid-pass");
                    return;
                }
            } else {
                System.out.println("not-found");
                return;
            }
        }
        boolean exist = false;
        long hours = 0;
        Iterator<Borrow> iterator = BorrowList.iterator();
        while (iterator.hasNext()) {
            Borrow brw = iterator.next();
            if (brw.getId().equals(id) && brw.getPassword().equals(passwd) && brw.getBookCode().equals(shenase2) && brw.getLibCode().equals(shenase1)) {
                exist = true;
                String startDateTimeString = (date2 + "-" + time2);
                String endDateTimeString = (brw.getDate() + "-" + brw.getTime());
                LocalDateTime startDateTime = LocalDateTime.parse(startDateTimeString, DateTimeFormatter.ofPattern("y-M-d-H:m"));
                LocalDateTime endDateTime = LocalDateTime.parse(endDateTimeString, DateTimeFormatter.ofPattern("y-M-d-H:m"));
                Duration duration = Duration.between(endDateTime, startDateTime);
                hours = duration.toHours();
                iterator.remove();
                break;
            }
        }
        if (!exist) {
            System.out.println("not-found");
            return;
        }
        for (Book existingBook : BookList) {
            if (existingBook.getBcode().equals(shenase2)) {
                IncreaseBookCount(shenase2, shenase1);
                for (Student stu : StudentList) {
                    if (stu.getId().equals(id)) {
                        if (hours > 240) {
                            long sum = ((hours - 240) * 50);
                            KolJarime newKolJarime = new KolJarime(sum);
                            KolJarimeList.add(newKolJarime);
                            System.out.println(sum);
                            ReturnList.add(return1);
                            return;
                        } else {
                            System.out.println("success");
                            return;
                        }
                    }
                }

                for (Staff stf : StaffList) {
                    if (stf.getId().equals(id)) {
                        if (hours > 336) {
                            long sum = ((hours - 336) * 100);
                            KolJarime newKolJarime = new KolJarime(sum);
                            KolJarimeList.add(newKolJarime);
                            System.out.println(sum);
                            ReturnList.add(return1);
                            return;
                        } else {
                            System.out.println("success");
                            return;
                        }
                    }
                }
            }
        }

        for (Thesis existingThesis : ThesisList) {
            if (existingThesis.getBcode().equals(shenase2)) {
                IncreasethesisCount(shenase2, shenase1);
                for (Student stu : StudentList) {
                    if (stu.getId().equals(id)) {
                        if (hours > 168) {
                            long sum = ((hours - 168) * 50);
                            KolJarime newKolJarime = new KolJarime(sum);
                            KolJarimeList.add(newKolJarime);
                            System.out.println(sum);
                            ReturnList.add(return1);
                            return;
                        } else {
                            System.out.println("success");
                            return;
                        }
                    }
                }

                for (Staff stf : StaffList) {
                    if (stf.getId().equals(id)) {
                        if (hours > 240) {
                            long sum = ((hours - 240) * 100);
                            KolJarime newKolJarime = new KolJarime(sum);
                            KolJarimeList.add(newKolJarime);
                            System.out.println(sum);
                            ReturnList.add(return1);
                            return;
                        } else {
                            System.out.println("success");
                            return;
                        }
                    }
                }
            }
        }
    }
    public static void BuyBook(String id, String passwd, String shenase1, String shenase2) {
        Buy buy = new Buy(id, passwd, shenase1, shenase2);
        for (Masool masool :MasoolList){
            if (masool.getId().equals(id)){
                System.out.println("permission-denied");
                return;
            }
        }
        Student foundStudent = null;
        Staff foundStaff = null;
        for (Student existingStudent : StudentList) {
            if (existingStudent.getId().equals(id)) {
                foundStudent = existingStudent;
                break;
            }
        }
        if (foundStudent != null) {
            if (foundStudent.getPasswd().equals(passwd)) {

            } else {
                System.out.println("invalid-pass");
                return;
            }
        } else {
            for (Staff existingStaff : StaffList) {
                if (existingStaff.getId().equals(id)) {
                    foundStaff = existingStaff;
                    break;
                }
            }
            if (foundStaff != null) {
                if (foundStaff.getPasswd().equals(passwd)) {

                } else {
                    System.out.println("invalid-pass");
                    return;
                }
            } else {
                System.out.println("not-found");
                return;
            }
        }
        boolean exist = false;
        for (Library existingLibrary : LibraryList) {
            if (existingLibrary.getShenase1().equals(shenase1)) {
                exist = true;
                break;
            }
        }
        if (!exist) {
            System.out.println("not-found");
            return;
        }
        for (GanjineBook ganjineBook : GanjineBookList) {
            if (ganjineBook.getBcode().equals(shenase2) && ganjineBook.getShenase2().equals(shenase1)) {
                System.out.println("not-allowed");
                return;
            }
        }
        for (Book book : BookList) {
            if (book.getBcode().equals(shenase2) && book.getShenase2().equals(shenase1)) {
                System.out.println("not-allowed");
                return;
            }
        }
        for (Thesis thesis : ThesisList) {
            if (thesis.getBcode().equals(shenase2) && thesis.getShenase2().equals(shenase1)) {
                System.out.println("not-allowed");
                return;
            }
        }
        boolean exist2 = false;
        for (SellingBook existingBook : SellingBookList) {
            if (existingBook.getBcode().equals(shenase2) && existingBook.getShenase2().equals(shenase1)
                    && !existingBook.getExistingNum().equals("0")) {
                exist2 = true ;
                break;
            } else if (existingBook.getBcode().equals(shenase2) && existingBook.getShenase2().equals(shenase1)
                    && existingBook.getExistingNum().equals("0")) {
                System.out.println("not-allowed");
                return;
            }
        }
        if (!exist2){
            System.out.println("not-found");
            return;
        }
        for (Return rtrn : ReturnList){
            if (rtrn.getId().equals(id)){
                System.out.println("not-allowed");
                return;
            }
        }
        DecreaseSeelingBook(shenase2 , shenase1);
    }
    public static void ReadBook(String id, String passwd, String shenase1, String shenase2, String date, String time){
        Read read = new Read(id, passwd, shenase1, shenase2, date, time);
        for (Masool masool :MasoolList){
            if (masool.getId().equals(id)){
                System.out.println("permission-denied");
                return;
            }
        }
        for (Student student : StudentList){
            if (student.getId().equals(id)){
                System.out.println("permission-denied");
                return;
            }
        }
        for (Staff staff : StaffList){
            if (staff.getId().equals(id) && !staff.getProfessorOrStaff().equals("professor")){
                System.out.println("permission-denied");
                return;
            }
        }
        boolean found = false;
        Staff foundStaff = null ;
        for (Staff staff : StaffList){
            if (staff.getId().equals(id) && staff.getProfessorOrStaff().equals("professor")){
                foundStaff = staff;
                found = true;
                break;
            }
        }
        if (found){
            if (foundStaff.getPasswd().equals(passwd)){
            }
            else {
                System.out.println("invalid-pass");
                return;
            }
        }
        else {
            System.out.println("not-found");
            return;
        }
        boolean exist = false;
        for (Library existingLibrary : LibraryList) {
            if (existingLibrary.getShenase1().equals(shenase1)) {
                exist = true;
                break;
            }
        }
        if (!exist) {
            System.out.println("not-found");
            return;
        }
        for (Book book : BookList){
            if (book.getBcode().equals(shenase2) && book.getShenase2().equals(shenase1)){
                System.out.println("not-allowed");
                return;
            }
        }
        for (Thesis thesis : ThesisList){
            if (thesis.getBcode().equals(shenase2) && thesis.getShenase2().equals(shenase1)){
                System.out.println("not-allowed");
                return;
            }
        }
        for (SellingBook seelingBook : SellingBookList){
            if (seelingBook.getBcode().equals(shenase2) && seelingBook.getShenase2().equals(shenase1)){
                System.out.println("not-allowed");
                return;
            }
        }
        boolean exist1 = false;
        for (GanjineBook ganjineBook : GanjineBookList){
            if (ganjineBook.getBcode().equals(shenase2) && ganjineBook.getShenase2().equals(shenase1)){
                exist1 = true;
                break;
            }
        }
        if (!exist1){
            System.out.println("not-found");
            return;
        }
        long min= 0 ;
        boolean isread = false ;
        for (Read read1 : ReadList) {
            if (read1.getBookCode().equals(shenase2) && read1.getLibCode().equals(shenase1)) {
                isread = true ;
                String startDateTimeString = (date + "-" + time );
                String endDateTimeString = (read1.getDate() + "-" + read1.getTime() );
                LocalDateTime startDateTime = LocalDateTime.parse(startDateTimeString, DateTimeFormatter.ofPattern("y-M-d-H:m"));
                LocalDateTime endDateTime = LocalDateTime.parse(endDateTimeString, DateTimeFormatter.ofPattern("y-M-d-H:m"));
                Duration duration = Duration.between(endDateTime, startDateTime);
                min = duration.toMinutes();
                if (min > 120){
                    ReadList.remove(read1);
                }
                break;
            }
        }
        if (!isread){
            System.out.println("success");
            ReadList.add(read);
            return;
        }
        if (min <= 120){
            System.out.println("not-allowed");
        }
        else {
            System.out.println("success");
            ReadList.add(read);
        }

    }
    public static void AddComment(String id, String passwd, String shenase1, String shenase2, String comment) {
        Comment comment1 = new Comment(id, passwd, shenase1, shenase2, comment);
        Student foundStudent = null;
        Staff foundStaff = null;
        for (Student existingStudent : StudentList) {
            if (existingStudent.getId().equals(id)) {
                foundStudent = existingStudent;
                break;
            }
        }
        if (foundStudent != null) {
            if (foundStudent.getPasswd().equals(passwd)) {
            } else {
                System.out.println("invalid-pass");
                return;
            }
        } else {
            for (Staff existingStaff : StaffList) {
                if (existingStaff.getId().equals(id)) {
                    if (existingStaff.getId().equals(id) && existingStaff.getProfessorOrStaff().equals("staff")) {
                        System.out.println("permission-denied");
                        return;
                    }
                    foundStaff = existingStaff;
                    break;
                }
            }
            if (foundStaff != null) {
                if (foundStaff.getPasswd().equals(passwd)) {
                } else {
                    System.out.println("invalid-pass");
                    return;
                }
            } else {
                for (Masool masool : MasoolList){
                    if (masool.getId().equals(id)){
                        System.out.println("permission-denied");
                        return;
                    }
                }
                System.out.println("not-found");
                return;
            }
        }
        boolean exist = false;
        for (Book book : BookList){
            if (book.getBcode().equals(shenase2) && book.getShenase2().equals(shenase1)){
                exist = true;
            }
        }
        for (SellingBook sellingBook : SellingBookList){
            if (sellingBook.getBcode().equals(shenase2) && sellingBook.getShenase2().equals(shenase1)){
                exist = true;
                break;
            }
        }
        for (GanjineBook ganjineBook : GanjineBookList){
            if (ganjineBook.getBcode().equals(shenase2) && ganjineBook.getShenase2().equals(shenase1)){
                exist = true;
                break;
            }
        }
        for (Thesis thesis : ThesisList){
            if (thesis.getBcode().equals(shenase2) && thesis.getShenase2().equals(shenase1)){
                exist = true;
                break;
            }
        }
        if (!exist) {
            System.out.println("not-found");
            return;
        }
        System.out.println("success");
        CommentList.add(comment1);
    }
    public static void Search(String something){
        ArrayList<String> myArrayList = new ArrayList<>();
        boolean isDuplicate = false;
        boolean isFirstMatch = true;
        for (Book existingBookData : BookList) {
            if (existingBookData.getOnvan().toLowerCase().contains(something.toLowerCase()) ||
                    existingBookData.getCreator().toLowerCase().contains(something.toLowerCase()) ||
                    existingBookData.getPub().toLowerCase().contains(something.toLowerCase())) {
                isDuplicate = true;
                myArrayList.add(existingBookData.getBcode());
            }
        }
        for (GanjineBook existingBookData : GanjineBookList) {
            if (existingBookData.getOnvan().toLowerCase().contains(something.toLowerCase()) ||
                    existingBookData.getCreator().toLowerCase().contains(something.toLowerCase()) ||
                    existingBookData.getPub().toLowerCase().contains(something.toLowerCase())) {
                isDuplicate = true;
                myArrayList.add(existingBookData.getBcode());
            }
        }
        for (SellingBook existingBookData : SellingBookList) {
            if (existingBookData.getOnvan().toLowerCase().contains(something.toLowerCase()) ||
                    existingBookData.getCreator().toLowerCase().contains(something.toLowerCase()) ||
                    existingBookData.getPub().toLowerCase().contains(something.toLowerCase())) {
                isDuplicate = true;
                myArrayList.add(existingBookData.getBcode());
            }
        }

        for (Thesis existingThesis : ThesisList) {
            if (existingThesis.getOnvan().toLowerCase().contains(something.toLowerCase()) ||
                    existingThesis.getCreator().toLowerCase().contains(something.toLowerCase()) ||
                    existingThesis.getPub().toLowerCase().contains(something.toLowerCase())) {
                isDuplicate = true;
                myArrayList.add(existingThesis.getBcode());
            }
        }

        if (!isDuplicate) {
            System.out.println("not-found");
        }
        else {
            Collections.sort(myArrayList);
            for (String codes : myArrayList){

                if (!isFirstMatch){
                    System.out.print("|");
                }
                else {
                    isFirstMatch = false;
                }
                System.out.print(codes);
            }
            System.out.println();
        }
    }
    public static void SearchUser(String id, String password, String nameOrLastName){
        boolean found = false;
        Staff foundStaff = null ;
        Masool foundMasool = null ;
        boolean exist = false;
        boolean isFirstMatch = true;
        ArrayList<String> myArrayList = new ArrayList<>();
        for (Staff staff : StaffList){
            if (staff.getId().equals(id)){
                foundStaff = staff ;
                found = true;
                break;
            }
        }
        if (found){
            if (!foundStaff.getPasswd().equals(password)){
                System.out.println("invalid-pass");
                return;
            }
        }
        else {
            for (Masool masool : MasoolList){
                if (masool.getId().equals(id)){
                    foundMasool = masool;
                    found = true;
                    break;
                }
            }
            if (found){
                if (!foundMasool.getPasswd().equals(password)){
                    System.out.println("invalid-pass");
                    return;
                }
            }
            else {
                for (Student student : StudentList) {
                    if (student.getId().equals(id)) {
                        System.out.println("permission-denied");
                        return;
                    }
                }
            }
            if (foundMasool == null && foundStaff == null) {
                System.out.println("not-found");
                return;
            }
        }
        for (Student existingstu : StudentList) {
            if (existingstu.getName().toLowerCase().contains(nameOrLastName.toLowerCase()) || existingstu.getLastname().toLowerCase().contains(nameOrLastName.toLowerCase())) {
                exist = true;
                myArrayList.add(existingstu.getId());
            }
        }
        for (Staff existingStf : StaffList) {
            if (existingStf.getName().toLowerCase().contains(nameOrLastName.toLowerCase()) || existingStf.getLastname().toLowerCase().contains(nameOrLastName.toLowerCase())) {
                exist = true;
                myArrayList.add(existingStf.getId());
            }
        }
        for (Masool masool : MasoolList){
            if (masool.getName().toLowerCase().contains(nameOrLastName.toLowerCase()) || masool.getLastname().toLowerCase().contains(nameOrLastName.toLowerCase())){
                exist = true;
                myArrayList.add(masool.getId());
            }
        }
        if (!exist) {
            System.out.println("not-found");
        }
        else {
            Collections.sort(myArrayList);
            for (String id2 : myArrayList) {

                if (!isFirstMatch){
                    System.out.print("|");
                }
                else {
                    isFirstMatch = false;
                }
                System.out.print(id2);
            }
            System.out.println();
        }
    }
    public static void CatReport(String ManagerName, String ManagerPass, String code, String libCode){
        if (checkexistingUser2(ManagerName , ManagerPass)){
            return;
        }
        if (checkManager(ManagerName)){
            return;
        }
        if (checkExistingManager(ManagerName , ManagerPass)){
            return;
        }
        if (code.equals("null")) {
        }
        else {
            if (checkCat(code)){
                return;
            }
        }
        if (checkLib(libCode)){
            return;
        }
        if (!checkManagerAndLib(ManagerName , libCode)){
            System.out.println("permission-denied");
            return;
        }
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        boolean hast = false;
        for (Book book : BookList) {
            if (book.getShenase2().equals(libCode)) {
                if (book.getCode().equals(code)) {
                    sum1 += Integer.parseInt(book.getExistingNum());
                    hast = true;
                } else if (CategoryList.containsKey(book.getCode())) {
                    String str = CategoryList.get(book.getCode()).getDastebandi();
                    while (!str.equals("null")) {
                        if (str.equals(code)) {
                            sum1 += Integer.parseInt(book.getExistingNum());
                            hast = true;
                        }
                        str = CategoryList.get(str).getDastebandi();
                    }
                }
            }
        }
        for (Thesis thesiss : ThesisList) {
            if (thesiss.getShenase2().equals(libCode)) {
                if (thesiss.getCode().equals(code)) {
                    if (existInBorrowList(thesiss.getBcode() , libCode , sum2)){
                        break;
                    }
                    sum2++;
                    hast = true;
                }
                if (CategoryList.containsKey(thesiss.getCode())) {
                    String str = CategoryList.get(thesiss.getCode()).getDastebandi();
                    while (!str.equals("null")) {
                        if (str.equals(code)) {
                            if (existInBorrowList(thesiss.getBcode() , libCode , sum2)){
                                break;
                            }
                            sum2++;
                            hast = true;
                        }
                        str = CategoryList.get(str).getDastebandi();
                    }
                }
            }
        }
        for (GanjineBook book : GanjineBookList) {
            if (book.getShenase2().equals(libCode)) {
                if (book.getCode().equals(code)) {
                    sum3++;
                    hast = true;
                }
                if (CategoryList.containsKey(book.getCode())) {
                    String str = CategoryList.get(book.getCode()).getDastebandi();
                    while (!str.equals("null")) {
                        if (str.equals(code)) {
                            sum3++;
                            hast = true;
                        }
                        str = CategoryList.get(str).getDastebandi();
                    }
                }
            }
        }
        for (SellingBook book : SellingBookList) {
            if (book.getShenase2().equals(libCode)) {
                if (book.getCode().equals(code)) {
                    sum4 += Integer.parseInt(book.getExistingNum());
                    hast = true;
                }
                if (CategoryList.containsKey(book.getCode())) {
                    String str = CategoryList.get(book.getCode()).getDastebandi();
                    while (!str.equals("null")) {
                        if (str.equals(code)) {
                            sum4 += Integer.parseInt(book.getExistingNum());
                            hast = true;
                        }
                        str = CategoryList.get(str).getDastebandi();
                    }
                }
            }
        }
        System.out.println(sum1 + " " + sum2 + " " + sum3 + " " + sum4);
    }
    public static void LibReport(String ManagerName, String ManagerPass, String libCode) {
        if (checkexistingUser2(ManagerName , ManagerPass)){
            return;
        }
        if (checkManager(ManagerName)) {
            return;
        }
        if (checkExistingManager(ManagerName, ManagerPass)) {
            return;
        }
        if (checkLib(libCode)){
            return;
        }
        if (!checkManagerAndLib(ManagerName , libCode)){
            System.out.println("permission-denied");
            return;
        }
        boolean exist = false;
        int books = 0;
        int thesis = 0;
        int borrowBook = 0;
        int borrowThesis = 0;
        int ganjine = 0;
        int seelingbook = 0;
        for (Library library : LibraryList) {
            if (library.getShenase1().equals(libCode)) {
                exist = true;
                for (Book book : BookList){
                    if (book.getShenase2().equals(libCode)){
                        books += Integer.parseInt(book.getExistingNum());
                    }
                }
                for (Thesis thesis1 : ThesisList){
                    if (thesis1.getShenase2().equals(libCode)){
                        thesis++;
                    }
                }
                for (GanjineBook ganjineBook : GanjineBookList){
                    if(ganjineBook.getShenase2().equals(libCode)){
                        ganjine++;
                    }
                }
                for (SellingBook seelingBook1: SellingBookList){
                    if (seelingBook1.getShenase2().equals(libCode)){
                        seelingbook += Integer.parseInt(seelingBook1.getExistingNum());
                    }
                }
            }
        }
        for (Book book : BookList) {
            for (Borrow brw : BorrowList) {
                if (brw.getBookCode().equals(book.getBcode()) && brw.getLibCode().equals(libCode) && book.getShenase2().equals(libCode)) {
                    borrowBook++;
                }
            }
        }
        for (Thesis tes : ThesisList) {
            for (Borrow brw : BorrowList) {
                if (brw.getBookCode().equals(tes.getBcode()) && brw.getLibCode().equals(libCode) && tes.getShenase2().equals(libCode)) {
                    borrowThesis++;
                }
            }
        }
        if (exist) {
            System.out.println(books + " " + (thesis - borrowThesis)+ " " + borrowBook + " " + borrowThesis + " " + ganjine + " " + seelingbook);
        } else {
            System.out.println("not-found");
        }
    }
    public static void PassedDeadline(String ManagerName, String ManagerPass , String lib , String date , String time) {
        ArrayList<String> myArrayList = new ArrayList<>();
        long hours;
        boolean ok = false;
        if (checkexistingUser2(ManagerName , ManagerPass)){
            return;
        }
        if (checkManager(ManagerName)){
            return;
        }
        if (checkExistingManager(ManagerName , ManagerPass)){
            return;
        }
        if (checkLib(lib)){
            return;
        }
        if (!checkManagerAndLib(ManagerName , lib)){
            System.out.println("permission-denied");
            return;
        }
        for (Borrow brw : BorrowList) {
            if(brw.getLibCode().equals(lib)){
                String startDateTimeString = (date + "-" + time);
                String endDateTimeString = (brw.getDate() + "-" + brw.getTime());
                LocalDateTime startDateTime = LocalDateTime.parse(startDateTimeString, DateTimeFormatter.ofPattern("y-M-d-H:m"));
                LocalDateTime endDateTime = LocalDateTime.parse(endDateTimeString, DateTimeFormatter.ofPattern("y-M-d-H:m"));
                Duration duration = Duration.between(endDateTime, startDateTime);
                hours = duration.toHours();
                for (Student stu : StudentList) {
                    if (brw.getId().equals(stu.getId())) {
                        for (Book bookData : BookList) {
                            if (brw.getBookCode().equals(bookData.getBcode())) {
                                if (hours > 240) {
                                    myArrayList.add(bookData.getBcode());
                                    ok = true;
                                }
                            }
                        }
                        for (Thesis thesis : ThesisList) {
                            if (brw.getBookCode().equals(thesis.getBcode())) {
                                if (hours > 168) {
                                    myArrayList.add(thesis.getBcode());
                                    ok = true;
                                }
                            }
                        }
                    }
                }
                for (Staff staff : StaffList) {
                    if (brw.getId().equals(staff.getId())) {
                        for (Book bookData : BookList) {
                            if (brw.getBookCode().equals(bookData.getBcode())) {
                                if (hours > 336) {
                                    myArrayList.add(bookData.getBcode());
                                    ok = true;
                                }
                            }
                        }
                        for (Thesis thesis : ThesisList) {
                            if (brw.getBookCode().equals(thesis.getBcode())) {
                                if (hours > 240) {
                                    myArrayList.add(thesis.getBcode());
                                    ok = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!ok) {
            System.out.println("none");
        } else {
            Set<String> uniqueCodes = new HashSet<>(myArrayList);
            List<String> sortedUniqueCodes = new ArrayList<>(uniqueCodes);
            Collections.sort(sortedUniqueCodes);

            for (int i = 0; i < sortedUniqueCodes.size(); i++) {
                if (i > 0) {
                    System.out.print("|");
                }
                System.out.print(sortedUniqueCodes.get(i));
            }
            System.out.println();
        }
    }
    public static void jarime(String AdminName , String AdminPass){
        if (checkexistingUser(AdminName , AdminPass)){
            return;
        }
        if (checkAdmin(AdminName)){
            return;
        }
        if ( checkExistingAdmin(AdminName , AdminPass)){
            return;
        }
        long total = 0L;
        for (int i = 0; i < KolJarimeList.size(); i++) {
            total += KolJarimeList.get(i).getJarime();
        }

        System.out.println(total);
    }
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        AddAdmin("admin" , "AdminPass");
        while (true) {
            String inpt = x.nextLine();
            if (inpt.equals("finish")) {
                return;
            }
            String[] command = inpt.split("#");
            String[] info = command[1].split("\\|");
            //info[0] , info[1] , info[2] , info[3] , info[4] , info[5] , info[6] ,info[7] , info[8] , info[9], info[10], info[11]
            if (command[0].equals("add-library")) {
                AddLib(info[0] , info[1] , info[2] , info[3] , info[4] , info[5] , info[6]);
            } else if (command[0].equals("add-category")) {
                AddCat(info[0] , info[1] , info[2] , info[3] , info[4]);
            } else if (command[0].equals("add-student")) {
                AddStu(info[0] , info[1] , info[2] , info[3] , info[4] , info[5] , info[6],info[7] , info[8]);
            } else if (command[0].equals("add-manager")) {
                AddManager(info[0] , info[1] , info[2] , info[3] , info[4] , info[5] , info[6] ,info[7] , info[8] , info[9]);
            } else if (command[0].equals("add-staff")) {
                AddStf(info[0] , info[1] , info[2] , info[3] , info[4] , info[5] , info[6] ,info[7] , info[8] , info[9]);
            } else if (command[0].equals("remove-user")) {
                RemoveUser(info[0] , info[1] , info[2]);
            } else if (command[0].equals("add-book")) {
                AddBook(info[0] , info[1] , info[2] , info[3] , info[4] , info[5] , info[6] ,info[7] , info[8] , info[9]);
            } else if (command[0].equals("add-thesis")) {
                AddThesis(info[0] , info[1] , info[2] , info[3] , info[4] , info[5] , info[6] ,info[7] , info[8]);
            } else if (command[0].equals("add-ganjineh-book")) {
                AddGanjine(info[0] , info[1] , info[2] , info[3] , info[4] , info[5] , info[6] ,info[7] , info[8] , info[9]);
            } else if (command[0].equals("add-selling-book")) {
                AddSellingBook(info[0] , info[1] , info[2] , info[3] , info[4] , info[5] , info[6] ,info[7] , info[8] , info[9] , info[10], info[11]);
            } else if (command[0].equals("remove-resource")) {
                RemoveResource(info[0] , info[1] , info[2] , info[3]);
            } else if (command[0].equals("buy")) {
                BuyBook(info[0] , info[1] , info[2] , info[3]);
            } else if (command[0].equals("read")) {
                ReadBook(info[0] , info[1] , info[2] , info[3] , info[4] , info[5]);
            } else if (command[0].equals("add-comment")) {
                AddComment(info[0] , info[1] , info[2] , info[3] , info[4]);
            } else if (command[0].equals("borrow")) {
                BorrowBook(info[0] , info[1] , info[2] , info[3] , info[4] , info[5]);
            } else if (command[0].equals("return")) {
                ReturnBook(info[0] , info[1] , info[2] , info[3] , info[4] , info[5]);
            } else if (command[0].equals("search")) {
                Search(info[0]);
            } else if (command[0].equals("search-user")) {
                SearchUser(info[0] , info[1] , info[2]);
            } else if (command[0].equals("category-report")) {
                CatReport(info[0] , info[1] , info[2] , info[3]);
            } else if (command[0].equals("library-report")) {
                LibReport(info[0] , info[1] , info[2]);
            } else if (command[0].equals("report-passed-deadline")) {
                PassedDeadline(info[0] , info[1] , info[2] , info[3] , info[4]);
            } else if (command[0].equals("report-penalties-sum")) {
                jarime(info[0] , info[1]);
            }
        }
    }
}