package dk.sdu.mmmi.assa.sm.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.testing.CompilationTestHelper;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(StateMachineInjectorProvider.class)
@SuppressWarnings("all")
public class UppaalChannelTest {
  @Inject
  @Extension
  private CompilationTestHelper _compilationTestHelper;
  
  public void assertUppaal(final CharSequence program, final CharSequence plantUml) {
    try {
      final IAcceptor<CompilationTestHelper.Result> _function = (CompilationTestHelper.Result it) -> {
        final Function1<String, Boolean> _function_1 = (String it_1) -> {
          return Boolean.valueOf(it_1.contains("uppaal.xta"));
        };
        final String key = IterableExtensions.<String>head(IterableExtensions.<String>filter(it.getAllGeneratedResources().keySet(), _function_1));
        Assert.assertEquals(plantUml.toString(), it.getAllGeneratedResources().get(key).toString());
      };
      this._compilationTestHelper.compile(program, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void whensWithSameSignal() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("project test");
    _builder.newLine();
    _builder.append("machine test {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("state A");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("state B");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("state C");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("A -> B when sig");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("B -> C when sig");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("chan sig;");
    _builder_1.newLine();
    _builder_1.append("process test {");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("state");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("A,");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("B,");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("C;");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("init A;");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("trans");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("A -> B {");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("sync sig?;");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("},");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("B -> C {");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("sync sig?;");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("};");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("process gen_sync_sig {");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("state");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("initSync;");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("init initSync;");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("trans");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("initSync -> initSync {");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("sync sig!;");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("};");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("system test, gen_sync_sig;");
    _builder_1.newLine();
    this.assertUppaal(_builder, _builder_1);
  }
}
