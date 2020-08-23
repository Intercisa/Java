import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { AppSharedModule } from 'src/app/shared/app-shared.module';
import { PaymentTypeDialogComponent } from './payment-type-dialog/payment-type-dialog.component';
import { PaymentTypeListComponent } from './payment-type-list/payment-type-list.component';
import { PaymentTypeRoutingModule } from './payment-type-routing.module';

@NgModule({
    
  declarations: [PaymentTypeDialogComponent, PaymentTypeListComponent],
  imports: [CommonModule, PaymentTypeRoutingModule, AppSharedModule],
  entryComponents: [PaymentTypeDialogComponent]
})
export class PaymentTypeModule{}