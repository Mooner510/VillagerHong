package org.mooner.villagerhong2;

import com.intellij.ide.IdeEventQueue;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.startup.StartupActivity;
import com.intellij.openapi.util.Disposer;
import org.jetbrains.annotations.NotNull;
import org.mooner.villagerhong2.listener.TypingListener;

public final class StartActivity implements StartupActivity {
    private Project project;

    @Override
    public void runActivity(@NotNull Project project) {
        this.project = project;
        System.out.println("Villager Hong! ON");
        IdeEventQueue.getInstance().addDispatcher(new TypingListener(), Disposer.newDisposable());
    }
}
