package easy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

public class TournamentWinnerTest {
    
    @Test
    public void testSolutionOne() {
        List<List<String>> competitions =  List.of(
            List.of("HTML", "CSS"),
            List.of("C#", "Python"),
            List.of("Python", "HTML")
        );
        List<Integer> results =  List.of(1, 1, 0);
        String expectedWinner = "HTML";

        TournamentWinner tw = new TournamentWinner();
        String actualWinner = tw.tournamentWinner(competitions, results);
        assertThat(actualWinner).isEqualTo(expectedWinner);
    }

    @Test
    public void testSolutionTwo() {
        List<List<String>> competitions =  List.of(
            List.of("HTML", "C#"),
            List.of("C#", "Python"),
            List.of("Python", "HTML")
        );
        List<Integer> results =  List.of(0, 0, 1);
        String expectedWinner = "Python";

        TournamentWinner tw = new TournamentWinner();
        String actualWinner = tw.tournamentWinner(competitions, results);
        assertThat(actualWinner).isEqualTo(expectedWinner);
    }
}
