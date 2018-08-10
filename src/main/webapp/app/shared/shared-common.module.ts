import { NgModule } from '@angular/core';

import { InsyncSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [InsyncSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [InsyncSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class InsyncSharedCommonModule {}
