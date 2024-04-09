import java.util.ArrayList;
import java.util.List;

public class Menu {
    /**
     * Le titre du menu.
     */
    private String title;
    /**
     * L'option finale du menu.
     */
    private String optionFinal;
    /**
     * Le message à afficher si aucune option n'est disponible.
     */
    private String aucuneOptionMessage;
    /**
     * Les différentes options du menu.
     */
    private List<String> options;

    /**
     * Constructeur du menu
     *
     * @param title               le titre du menu
     * @param optionFinal         l'option finale du menu (quitter, retourner, etc.
     * @param aucuneOptionMessage le message à afficher si aucune option n'est disponible
     * @param options             les différentes options du menu
     */
    public Menu(String title, String optionFinal, String aucuneOptionMessage,
                ArrayList<String> options) {
        this.title = title;
        this.optionFinal = optionFinal;
        this.aucuneOptionMessage = aucuneOptionMessage;
        this.options = options;
    }

    /**
     * Constructeur du menu si aucun paramètre n'est donné.
     */
    public Menu() {
        this("", "", "Aucune option disponible.", new ArrayList<String>());
    }

    /**
     * Constructeur du menu si on initialise uniquement avec les options.
     *
     * @param options les différentes options du menu
     */
    public Menu(ArrayList<String> options) {
        this("", "", "Aucune option disponible.", options);
    }

    /**
     * Constructeur pour menu si aucune option n'est disponible.
     *
     * @param optionFinal l'option finale du menu (quitter, retourner, etc).
     * @param titre       le titre du menu.
     */
    public Menu(String titre, String optionFinal) {
        this(titre, optionFinal, "Aucune option disponible.", new ArrayList<String>());
    }

    /**
     * Retourne le menu sous format de chaine de caractère.
     *
     * @return le menu sous format de chaine de caractère.
     */
    public String menuToPrint() {
        String menu = "";
        if (!title.isEmpty()) {
            menu += title + "\n";
        }
        if (options.isEmpty()) {
            menu += "\t" + aucuneOptionMessage + "\n";
        } else {
            for (int i = 0; i < options.size(); i++) {
                menu += "\t" + (i + 1) + ". " + options.get(i) + "\n";
            }
            if (!optionFinal.isEmpty()) {
                menu += "\t0. " + optionFinal + "\n";
            }
        }
        return menu;
    }

    /**
     * Ajoute une option au menu.
     *
     * @param option l'option à ajouter.
     */
    public void ajouterOption(String option) {
        options.add(option);
    }

    /**
     * @return le titre du menu.
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title le titre du menu.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    public String getOptionFinal() {
        return optionFinal;
    }

    public void setOptionFinal(String optionFinal) {
        this.optionFinal = optionFinal;
    }

    public String getAucuneOptionMessage() {
        return aucuneOptionMessage;
    }

    public void setAucuneOptionMessage(String aucuneOptionMessage) {
        this.aucuneOptionMessage = aucuneOptionMessage;
    }

    /**
     * @return les différentes options du menu.
     */
    public List<String> getOptions() {
        return List.copyOf(options);
    }

    /**
     * Modifie une option du menu.
     *
     * @param index  l'index de l'option à modifier.
     * @param option la nouvelle option.
     * @throws IndexOutOfBoundsException si l'index n'existe pas.
     */

    public void setOptions(int index, String option) throws IndexOutOfBoundsException {
        try {
            options.set(index, option);
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException("L'index n'existe pas.");
        }
    }

    /**
     * Enlève une option du menu.
     *
     * @param index l'index de l'option à enlever.
     * @throws IndexOutOfBoundsException si l'index n'existe pas.
     */
    public void removeOption(int index) throws IndexOutOfBoundsException {
        try {
            options.remove(index);
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException("L'index n'existe pas.");
        }
    }
}
