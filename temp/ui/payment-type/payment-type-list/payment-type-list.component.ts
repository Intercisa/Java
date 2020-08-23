import { Component, ViewChild } from '@angular/core';
import { AsapAgFullScreenGridComponent } from '@asap/components/asap-ag-full-screen-grid/asap-ag-full-screen-grid.component';
import { GridColumnConfigBuilder } from '@asap/helpers/grid-config.helper';
import { AsnIcons } from '@common/asn-icons';
import { GenericListComponent } from '@common/components/generics/generic-list.component';
import { PermissionService } from '@common/modules/permisson/permission.service';
import { TranslateService } from '@ngx-translate/core';
import { GuaranteeNature, PaymentType, Role } from '@services/api/contracts';
import { ConfirmationService } from '@services/confirmation.service';
import { PaymentTypeService } from '@services/masterdata/payment-type/payment-type.service';
import { PaymentTypeDialogComponent } from '../payment-type-dialog/payment-type-dialog.component';

@Component({
  selector: 'app-payment-type-list',
  templateUrl: './payment-type-list.component.html',
  styleUrls: ['./payment-type-list.component.scss']
})
export class PaymentTypeListComponent extends GenericListComponent<PaymentType, PaymentType, PaymentTypeDialogComponent>{

  @ViewChild(
    AsapAgFullScreenGridComponent, {static:true}
  ) gridComponent:AsapAgFullScreenGridComponent<PaymentType>;

  constructor(
    private paymentTypeService:PaymentTypeService,
    translate:TranslateService,
    dialog:Dialog,
    confirmationService: ConfirmationService,
    permissionService: PermissionService
  ) {
    super(
      paymentTypeService,
      translate,
      dialog,
      confirmationService,
      PaymentTypeDialogComponent,
      permissionService,
    );
   }
   buildColumns( builder: GridColumnConfigBuilder<GuaranteeNature> ) {
    builder
      .addStringColumn( { header: this.translate.instant( "Entity.GuaranteeNature.Name" ), field: "name", sort: "asc" } )
      .addBooleanColumn( { header: this.translate.instant( "Commons.Active" ), field: "active" } )
      .addActionToActionMenu( {
        text: this.translate.instant( "Commons.Activate" ),
        icon: AsnIcons.ACTIVATE,
        isActive: data => !data.active && this.canDelete( data ),
        action: async guaranteeNature => this.onActivateClick( guaranteeNature, true )
      } )
      .addActionToActionMenu( {
        text: this.translate.instant( "Commons.Inactivate" ),
        icon: AsnIcons.INACTIVATE,
        isActive: data => data.active && this.canDelete( data ),
        action: async guaranteeNature => this.onActivateClick( guaranteeNature, false )
      } );
  }

  private async onActivateClick( paymentType: PaymentType, activate: boolean ) {
    await this.paymentTypeService.activate( paymentType.id, activate );
    await this.reloadGrid();
  }

  protected getHumanReadableName( data: PaymentType ): string {
    return data.name;
  }

  protected setCrudRoles() {
    this.setRoles( [ Role.GUARANTEE_NATURE_VIEW ] );
  }

}
