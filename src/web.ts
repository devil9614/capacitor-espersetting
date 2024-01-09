import { WebPlugin } from '@capacitor/core';

import type { CapacitorEsperSettingPlugin } from './definitions';

export class CapacitorEsperSettingWebPlugin
  extends WebPlugin
  implements CapacitorEsperSettingPlugin
{
  async launchEsperSettings(): Promise<void> {
    console.warn('The Esper Settings cannot be launched on the web.');
  }
}
