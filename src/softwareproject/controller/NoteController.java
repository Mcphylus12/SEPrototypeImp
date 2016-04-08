package softwareproject.controller;

import java.util.Date;
import softwareproject.model.Notable;
import softwareproject.model.Note;

public class NoteController {
    
    public static Note createNote(String name, String contents, Date dateCreated){
        return new Note(name, contents, dateCreated);
    }

    public static void attachNote(Notable parent, Note newNote) {
        parent.addNote(newNote);
    }
    
}
