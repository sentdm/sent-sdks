import { Sentdm } from "./index";

describe("sentdm-typescript-sdk", () => {
    it("initialize client", async () => {
        const sentdm = new Sentdm({
            apiKey: "API_KEY",
        });
    });
});
