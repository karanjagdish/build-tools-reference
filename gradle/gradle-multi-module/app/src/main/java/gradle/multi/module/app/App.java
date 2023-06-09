/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradle.multi.module.app;

import gradle.multi.module.list.LinkedList;

import static gradle.multi.module.utilities.StringUtils.join;
import static gradle.multi.module.utilities.StringUtils.split;
import static gradle.multi.module.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));
    }
}
