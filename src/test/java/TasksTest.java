import ru.netology.hm11.Epic;
import ru.netology.hm11.Meeting;
import ru.netology.hm11.SimpleTask;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {
    @Test
    public void testEpic() {
        String[] subtasks = {"Купить ", "Продать", "Взять"};
        Epic epic = new Epic(1, subtasks);
        Assertions.assertTrue(epic.matches("Продать"));
        Assertions.assertFalse(epic.matches("продать"));
        Assertions.assertFalse(epic.matches("Гвозди"));
        Assertions.assertTrue(epic.matches(""));
    }

    @Test
    public void testSimple() {
        SimpleTask simpleTask = new SimpleTask(1, "Выкатка 3й версии приложения");
        Assertions.assertFalse(simpleTask.matches("Закат"));
        Assertions.assertTrue(simpleTask.matches("Выкатка"));
        Assertions.assertTrue(simpleTask.matches(""));
    }

    @Test
    public void testMeeting() {
        Meeting meeting = new Meeting(1, "Тема", "Проект", "Время начало");
        Assertions.assertTrue(meeting.matches("Проект"));
        Assertions.assertFalse(meeting.matches("Закат"));
        Assertions.assertTrue(meeting.matches(""));
    }

}
