import java.io.File;

class Main{
    public static void main(String args[]) {


        File[] files = new File("F:\\UVA").listFiles();

        int sum = 0;
        for(File file : files) {
            String name = file.getName();
            for(File f : file.listFiles()){
                String n = f.getName();
                if(n.contains("C____")){
                    f.renameTo(new File(file.getAbsolutePath() + "\\C____" + name));
                }else if(n.contains("JAVA____")){
                    f.renameTo(new File(file.getAbsolutePath() + "\\JAVA____" + name));
                }
            }



//            String old = name.split(" ")[0];
//            String path = file.getAbsolutePath();
//            File Q = new File(path + "\\Qusetion");
//
//            if(!Q.exists()){
//                continue;
//            }
//            File I = new File(Q.getAbsolutePath() + "\\" + old + "_IMG");
//            File P = new File(Q.getAbsolutePath() + "\\" + old + ".pdf");
//
//            if(I.exists()){
//                File[] Is =  I.listFiles();
//                if(Is != null && Is.length != 0){
//                    for(File i : Is){
//                        String n = i.getName();
//                        if(n.contains("_1")){
//                            i.renameTo(new File(I.getAbsolutePath() + "\\" + "IMG__01__" + name + ".jpg"));
//                        }else if(n.contains("_2")){
//                            i.renameTo(new File(I.getAbsolutePath() + "\\" + "IMG__02__" + name + ".jpg"));
//                        }else if(n.contains("_3")){
//                            i.renameTo(new File(I.getAbsolutePath() + "\\" + "IMG__03__" + name + ".jpg"));
//                        } else if(n.contains("_4")){
//                            i.renameTo(new File(I.getAbsolutePath() + "\\" + "IMG__04__" + name + ".jpg"));
//                        } else if(n.contains("_5")){
//                            i.renameTo(new File(I.getAbsolutePath() + "\\" + "IMG__05__" + name + ".jpg"));
//                        } else if(n.contains("_6")){
//                            i.renameTo(new File(I.getAbsolutePath() + "\\" + "IMG__06__" + name + ".jpg"));
//                        } else if(n.contains("_7")){
//                            i.renameTo(new File(I.getAbsolutePath() + "\\" + "IMG__07__" + name + ".jpg"));
//                        } else if(n.contains("_8")){
//                            i.renameTo(new File(I.getAbsolutePath() + "\\" + "IMG__08__" + name + ".jpg"));
//                        } else if(n.contains("_9")){
//                            i.renameTo(new File(I.getAbsolutePath() + "\\" + "IMG__09__" + name + ".jpg"));
//                        } else if(n.contains("_10")){
//                            i.renameTo(new File(I.getAbsolutePath() + "\\" + "IMG__10__" + name + ".jpg"));
//                        }
//                }
//
//
//                }
//
//                I.renameTo(new File(Q.getAbsolutePath() + "\\IMG____" + name));
//            }
//
//            if(P.exists()){
//                P.renameTo(new File(Q.getAbsolutePath() + "\\PDF____" + name + ".pdf"));
//            }
//
//
//            Q.renameTo(new File(path + "\\Question____" + name));

        }
    }

}