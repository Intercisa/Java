import { Component, Injector }              from "@angular/core";
import { TypedFormBuilder, TypedFormGroup } from "@ashszoftverhaz/asap-material2-ui-lib";
import { GenericCrudDialogComponent }       from "@common/components/generics/generic-crud-dialog.component";
import { Constants }                        from "@common/constants";
import { MessageService }                   from "@common/modules/message/message.service";
import { TranslateService }                 from "@ngx-translate/core";
import { PaymentType } from '@services/api/contracts';
import { PaymentTypeService } from '@services/masterdata/payment-type/payment-type.service';

@Component({
  selector: 'app-payment-type-dialog',
  templateUrl: './payment-type-dialog.component.html',
  styleUrls: ['./payment-type-dialog.component.scss']
})
export class PaymentTypeDialogComponent 
extends GenericCrudDialogComponent<PaymentType, PaymentType, PaymentTypeDialogComponent> {

  constructor(injector: Injector,
              formBuilder: TypedFormBuilder,
              restService: PaymentTypeService,
              messageService: MessageService,
              private translate: TranslateService
  ) {
  super(injector, messageService, restService, formBuilder);
  }

  buildForm(): TypedFormGroup<PaymentType> {
    const builder = this.formBuilder.groupBuilder<PaymentType>();
    builder
      .addStringInputFormControl( {
        property: paymentType => paymentType.name,
        validatorConfig: Constants.MASTERDATA_NAME_VALIDATOR,
      } )
      .addRawValue( paymentType => paymentType.active )
      .addRawValue( paymentType => paymentType.version )
    ;

    if ( !this.isCreateMode ) {
      builder.addRawValue( paymentType => paymentType.id );
    }
    return builder.get();
  }

  afterSave( model: PaymentType ): void {
    this.messageService.success( "PaymentTypeManagement.SaveSuccess", { name: model.name } );
  }

  protected get translatePrefix(): string {
    return "PaymentTypeManagement";
  }


}
