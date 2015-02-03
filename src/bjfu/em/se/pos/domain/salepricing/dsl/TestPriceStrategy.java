package bjfu.em.se.pos.domain.salepricing.dsl;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

/**
 * Created by Roy on 2015/2/2.
 */
public class TestPriceStrategy {
    public static void main(String[] args) throws IOException {
        ANTLRInputStream input=new ANTLRInputStream(TestPriceStrategy.class.getResourceAsStream("/test.rule"));
        PriceStrategyLexer lexer=new PriceStrategyLexer(input);
        CommonTokenStream tokens=new CommonTokenStream(lexer);
        PriceStrategyParser parser=new PriceStrategyParser(tokens);
        ParseTree tree=parser.script();
        System.out.println(tree.toStringTree(parser));

        System.out.println(tokens.getTokens().size());
        for (Token t:tokens.getTokens()) {
            System.out.println(t);
        }

    }
}
