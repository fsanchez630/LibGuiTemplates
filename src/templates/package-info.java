@TemplateRegistrations({
    @TemplateRegistration(
            folder = "GUIForms",
            iconBase = "templates/Formulario.png",
            displayName = "#FormSimple_displayName",
            content = {"FormSimple.java.template", "FormSimple.form.template"},
            description = "FormSimpleDescription.html",
            scriptEngine = "freemarker"),
    @TemplateRegistration(
            folder = "GUIForms",
            iconBase = "templates/Formulario.png",
            displayName = "#FormularioSimple_displayName",
            content = {"FormularioSimple.java.template", "FormularioSimple.form.template"},
            description = "FormularioSimpleDescription.html",
            scriptEngine = "freemarker"),
    @TemplateRegistration(
            folder = "GUIForms",
            iconBase = "templates/Formulario.png",
            displayName = "#FormularioPorFichas_displayName",
            content = {"FormularioPorFichas.java.template", "FormularioPorFichas.form.template"},
            description = "FormularioPorFichasDescription.html",
            scriptEngine = "freemarker"),
    @TemplateRegistration(
            folder = "GUIForms",
            iconBase = "templates/Formulario.png",
            displayName = "#FormularioArbol_displayName",
            content = {"FormularioArbol.java.template", "FormularioArbol.form.template"},
            description = "FormularioArbolDescription.html",
            scriptEngine = "freemarker")
})
@Messages({"FormSimple_displayName=Formulario Simple Vacio",
    "FormularioSimple_displayName=Formulario Simple Vacio",
    "FormularioPorFichas_displayName=Formulario Por Fichas Vacio",
    "FormularioArbol_displayName=Formulario Arbol Vacio"})

package templates;

import org.netbeans.api.templates.TemplateRegistration;
import org.netbeans.api.templates.TemplateRegistrations;
import org.openide.util.NbBundle.Messages;
