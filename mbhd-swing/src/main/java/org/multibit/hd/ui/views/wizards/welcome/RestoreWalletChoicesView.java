package org.multibit.hd.ui.views.wizards.welcome;

import net.miginfocom.swing.MigLayout;
import org.multibit.hd.core.api.MessageKey;
import org.multibit.hd.ui.views.components.PanelDecorator;
import org.multibit.hd.ui.views.components.Panels;
import org.multibit.hd.ui.views.wizards.AbstractWizard;
import org.multibit.hd.ui.views.wizards.AbstractWizardView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * <p>Wizard to provide the following to UI:</p>
 * <ul>
 * <li>Restore wallet choices</li>
 * </ul>
 *
 * @since 0.0.1
 *         
 */

public class RestoreWalletChoicesView extends AbstractWizardView<WelcomeWizardModel, String> implements ActionListener {

  /**
   * @param wizard The wizard managing the states
   */
  public RestoreWalletChoicesView(AbstractWizard<WelcomeWizardModel> wizard) {

    super(wizard.getWizardModel(), MessageKey.RESTORE_WALLET_TITLE);

    PanelDecorator.addExitCancelPreviousNext(this, wizard);

  }

  @Override
  public JPanel newDataPanel() {

    JPanel panel = Panels.newPanel(new MigLayout(
      "fill", // Layout constrains
      "[][][]", // Column constraints
      "[]" // Row constraints
    ));

    // TODO fill this in

    return panel;
  }

  @Override
  public void updatePanelModel() {
    // Do nothing - model is updated via an action
  }

  /**
   * <p>Handle the "select wallet" action event</p>
   *
   * @param e The action event
   */
  @Override
  public void actionPerformed(ActionEvent e) {

    // Do nothing

  }
}
