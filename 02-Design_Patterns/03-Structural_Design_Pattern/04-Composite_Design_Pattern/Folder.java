import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystem{
    private List<FileSystem> folder;
    private String folderName;

    public Folder(String folderName){
        this.folder = new ArrayList<>();
        this.folderName = folderName;
    }

    public void addFileSystem(FileSystem fileSystem){
        this.folder.add(fileSystem);
    }

    public void ls(){
        System.out.println("Folder "+folderName+":");

        for(FileSystem fileSystem:folder){
            fileSystem.ls();
        }
    }
}
