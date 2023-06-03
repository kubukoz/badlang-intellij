package badlang;

import org.wso2.lsp4intellij.IntellijLanguageClient;
import org.wso2.lsp4intellij.client.languageserver.serverdefinition.RawCommandServerDefinition;

import java.util.Map;

class MyPreloadingActivity extends com.intellij.openapi.application.PreloadingActivity {
    @Override
    public void preload() {
        IntellijLanguageClient.addServerDefinition(
                new RawCommandServerDefinition("bad",
                        new String[]{"/Users/kubukoz/projects/badlang/launch.sh"})
        );
    }

}
